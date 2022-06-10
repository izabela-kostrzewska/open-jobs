package pl.izakostrzewska.openjobs.application.exception;

public class UserNotRegisteredException extends RuntimeException {

    public UserNotRegisteredException() {
        super("User is not registered yet");
    }
}
