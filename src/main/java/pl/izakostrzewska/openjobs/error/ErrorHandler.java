package pl.izakostrzewska.openjobs.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.izakostrzewska.openjobs.application.dto.ErrorDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public ErrorDTO handle(Exception e) {
        return logAndConstruct(HttpStatus.INTERNAL_SERVER_ERROR, e);
    }

    public ErrorDTO logAndConstruct(HttpStatus status, Exception e) {
        UUID errorId = UUID.randomUUID();
        log.error("Handled an error (id: {})", errorId, e);
        return ErrorDTO.builder()
                .id(errorId)
                .timestamp(LocalDateTime.now())
                .status(status.value())
                .message(e.getMessage())
                .build();
    }
}
