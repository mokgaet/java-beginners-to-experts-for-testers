package Chapter8.UserExceptions;

public class NoExamEntryException extends RuntimeException {

    public NoExamEntryException(String message) {
        super(message);
    }

}
