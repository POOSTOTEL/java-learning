package homework12.documentChecker;

public class DoesNotStartWithABCException extends Exception {
    private String detail;

    public DoesNotStartWithABCException(String message, String detail) {
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
