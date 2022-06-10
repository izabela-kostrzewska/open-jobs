package pl.izakostrzewska.openjobs.application.exception;

public class ConfirmationNotExistsException extends RuntimeException {

    public ConfirmationNotExistsException() {
        super("Confirmation does not exists");
    }
}
