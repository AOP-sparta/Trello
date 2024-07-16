package sparta.trello.domain.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sparta.trello.domain.board.Board;
import sparta.trello.domain.board.BoardRepository;
import sparta.trello.domain.board.Invite;
import sparta.trello.domain.board.InviteRepository;
import sparta.trello.domain.card.dto.*;
import sparta.trello.domain.status.Status;
import sparta.trello.domain.status.StatusRepository;
import sparta.trello.domain.status.StatusService;
import sparta.trello.domain.user.User;
import sparta.trello.domain.user.UserRepository;
import sparta.trello.domain.user.UserService;
import sparta.trello.global.exception.CustomException;
import sparta.trello.global.exception.ErrorCode;
import sparta.trello.global.security.UserPrincipal;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    private final StatusRepository statusRepository;
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;
    private final InviteRepository inviteRepository;

    private final UserService userService;
    private final StatusService statusService;

    public CardResponseDto create(CardRequestDto requestDto, Long statusId, Long boardId, User user) {

        Status status = checkStatus(statusId);

        Board board = checkBoard(boardId);

        availableCheck(board, user);

        Card card = Card.builder()
                .status(status)
                .board(board)
                .user(user)
                .content(requestDto.getContent())
                .title(requestDto.getTitle())
                .deadline(requestDto.getDeadline())
                .build();

        cardRepository.save(card);

        return new CardResponseDto(requestDto.getContent(), requestDto.getTitle(), requestDto.getDeadline(), status, user);
    }

    public List<CardResponseDto> findCardList(UserPrincipal principal, Long boardId, CardSearchCond searchCond) {
        if(!boardRepository.existsById(boardId)){
            throw new CustomException(ErrorCode.NOT_FOUND_BOARD);
        }

        User user = principal.getUser();
        Board board = checkBoard(boardId);
        availableCheck(board, user);

        List<Card> cardList = cardRepository.findBySearchCond(boardId, searchCond);

        return cardList.stream().map(card -> new CardResponseDto(card.getContent(), card.getTitle(), card.getDeadline(), card.getStatus(), card.getUser()))
                .collect(Collectors.toList());
    }


    public FindCardResponseDto findCard(Long cardId, Long boardId, User user) {
        Board board = checkBoard(boardId);

        availableCheck(board, user);

        Card card = checkCard(cardId);

        return new FindCardResponseDto(card.getTitle(), card.getBoard(), card.getStatus(), card.getContent(), card.getUser(), card.getDeadline());
    }

    public void deleteCard(Long boardId, Long cardId, User user) {
        Board board = checkBoard(boardId);

        availableCheck(board, user);

        Card card = checkCard(cardId);

        if(!Objects.equals(user.getNickname(), card.getUser().getNickname())){
            throw new CustomException(ErrorCode.NOT_PERMISSION_DELETE);
        }

        cardRepository.delete(card);
    }

    public CardUpdateResponseDto updateCard(Long boardId, Long cardId, CardUpdateRequestDto requestDto, User user) {
        Board board = checkBoard(boardId);
        availableCheck(board, user);

        Card card = checkCard(cardId);

        if(!Objects.equals(card.getUser().getNickname(), user.getNickname())){
            throw new CustomException(ErrorCode.NOT_PERMISSION_UPDATE);
        }

        User newUser = userRepository.findByNickname(requestDto.getNickname()).orElseThrow(
                ()-> new CustomException(ErrorCode.USERNAME_NOT_FOUND)
        );
        card.updateUser(newUser);
        card.updateTitle(requestDto.getTitle());
        card.updateContent(requestDto.getContent());
        card.updateDeadline(requestDto.getDeadline());

        cardRepository.save(card);
        return new CardUpdateResponseDto(requestDto.getTitle(), requestDto.getContent(), newUser, requestDto.getDeadline());
    }

    public void changeStatus(Long cardId, Long newStatusId, User user) {
        Card card = checkCard(cardId);

        if(!Objects.equals(card.getUser().getNickname(), user.getNickname())){
            throw new CustomException(ErrorCode.NOT_PERMISSION_CHANGE);
        }

        Long pastStatusId = card.getStatus().getId();

        if(!Objects.equals(pastStatusId, newStatusId)){
           card.updateStatus(newStatusId);
           cardRepository.save(card);
        }

    }
  
    private void availableCheck(Board board, User user) {
        if(Objects.equals(board.getUser().getNickname(), user.getNickname())){
            return;
        }

        boolean isInvited = inviteRepository.findByBoardAndUser(board, user).isPresent();
        if (!isInvited) {
            throw new CustomException(ErrorCode.NOT_PERMISSION);
        }
    }

    public Board checkBoard(Long boardId){
        Board board = boardRepository.findById(boardId).orElseThrow(
                ()-> new CustomException(ErrorCode.NOT_FOUND_BOARD)
        );
        return board;
    }

    public Card checkCard(Long cardId){
        Card card = cardRepository.findById(cardId).orElseThrow(
                () -> new CustomException(ErrorCode.NOT_FOUND_CARD)
        );

        return card;
    }

    public Status checkStatus(Long statusId){
        Status status = statusRepository.findById(statusId).orElseThrow(
                () -> new CustomException(ErrorCode.NOT_FOUND_STATUS)
        );
        return status;
    }
}
