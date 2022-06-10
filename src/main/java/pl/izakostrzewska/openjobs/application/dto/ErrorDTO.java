package pl.izakostrzewska.openjobs.application.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class ErrorDTO {

    private UUID id;
    private LocalDateTime timestamp;
    private Integer status;
    private String message;
}
