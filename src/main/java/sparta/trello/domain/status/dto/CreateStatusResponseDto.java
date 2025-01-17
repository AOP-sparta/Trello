package sparta.trello.domain.status.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateStatusResponseDto {
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public CreateStatusResponseDto(String title, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
