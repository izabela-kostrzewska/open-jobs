package pl.izakostrzewska.openjobs.application.exception;

public class ConfirmationExpiredException extends RuntimeException {

    public ConfirmationExpiredException() {
        super("Confirmation is already expired");
    }
}
