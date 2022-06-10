package pl.izakostrzewska.openjobs.application.exception;

public class VerificationAlreadyConfirmedException extends RuntimeException {

    public VerificationAlreadyConfirmedException() {
        super("Verification is already confirmed");
    }
}
