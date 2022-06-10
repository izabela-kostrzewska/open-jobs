package pl.izakostrzewska.openjobs.application.exception;

public class OfferNotExistsException extends RuntimeException {

    public OfferNotExistsException(Long offerId) {
        super("Offer " + offerId + " was not found");
    }
}
