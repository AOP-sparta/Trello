package sparta.trello.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // basic
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "BAD REQUEST"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "FORBIDDEN"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "NOT FOUND"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR"),
    // 필요시 직접 추가 (위 참고 해서)

    // Token
    NOT_FOUND_TOKEN(HttpStatus.NOT_FOUND, "토큰이 없습니다."),
    TOKEN_EXPIRED(HttpStatus.BAD_REQUEST, "토큰이 만료되었습니다."),
    TOKEN_INVALID(HttpStatus.BAD_REQUEST, "토큰이 유효하지 않습니다."),
    NOT_FOUND_REFRESH_TOKEN(HttpStatus.NOT_FOUND, "리프레쉬 토큰이 없습니다."),


    // Status(Column)
    NOT_FOUND_STATUS_TITLE(HttpStatus.NOT_FOUND, "필수 데이터가 존재하지 않습니다."),
    ALREADY_EXIST_TITLE(HttpStatus.BAD_REQUEST, "이미 존재하는 컬럼명 입니다."),
    NOT_FOUND_BOARD(HttpStatus.NOT_FOUND, "보드를 찾을 수 없습니다."),
    NOT_FOUND_STATUS(HttpStatus.NOT_FOUND, "칼럼을 찾을 수 없습니다."),

    // User
    USERNAME_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
    ALREADY_EXISTING_USER(HttpStatus.BAD_REQUEST, "이미 존재하는 아이디입니다."),
    PASSWORD_NOT_MATCH(HttpStatus.FORBIDDEN, "비밀번호가 일치하지 않습니다."),
    USER_NICKNAME_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 닉네임입니다."),

    // Comment
    NOT_FOUND_CARD(HttpStatus.NOT_FOUND, "카드를 찾을 수 없습니다."),

    //Card
    NOT_PERMISSION_DELETE(HttpStatus.UNAUTHORIZED, "삭제할 수 없습니다."),
    NOT_PERMISSION_UPDATE(HttpStatus.UNAUTHORIZED, "수정할 수 없습니다"),
    NOT_PERMISSION_CHANGE(HttpStatus.UNAUTHORIZED, "변경할 수 없습니다."),


    // Board
    NOT_PERMISSION(HttpStatus.FORBIDDEN, "사용할 수 없습니다."),
    FORBIDDEN_BOARD(HttpStatus.FORBIDDEN, "해당 보드 권한이 없습니다."),
    NOT_INVITE(HttpStatus.NOT_ACCEPTABLE, "초대되지 않은 유저 입니다."),
    BAD_INVITE(HttpStatus.BAD_REQUEST, "이미 해당 보드에 초대한 유저입니다.");

    private final HttpStatus status;
    private final String message;

}
