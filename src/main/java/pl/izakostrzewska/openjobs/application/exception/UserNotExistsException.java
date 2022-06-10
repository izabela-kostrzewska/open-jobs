package pl.izakostrzewska.openjobs.application.exception;

public class UserNotExistsException extends RuntimeException {

    public UserNotExistsException() {
        super("User does not exist");
    }
}
