package A09_Exception.MyException;

public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {

    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
