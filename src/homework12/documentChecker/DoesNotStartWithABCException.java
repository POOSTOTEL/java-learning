package homework12.documentChecker;

public class DoesNotStartWithABCException extends Exception {
    private int detail;

    public DoesNotStartWithABCException(String message, int detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "ABCException{" +
                "detail=" + detail
                + ", message=" + getMessage()
                + "} ";
    }
}
