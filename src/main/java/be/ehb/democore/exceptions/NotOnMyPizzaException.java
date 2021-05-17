package be.ehb.democore.exceptions;

public class NotOnMyPizzaException extends RuntimeException{

    public NotOnMyPizzaException() {
    }

    public NotOnMyPizzaException(String message) {
        super(message);
    }
}
