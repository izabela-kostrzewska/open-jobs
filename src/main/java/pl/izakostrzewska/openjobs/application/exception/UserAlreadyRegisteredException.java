package pl.izakostrzewska.openjobs.application.exception;

public class UserAlreadyRegisteredException extends RuntimeException {

    public UserAlreadyRegisteredException() {
        super("User is already registered");
    }
}
