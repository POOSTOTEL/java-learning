package homework12.documentChecker;

public class DoesNotEndWith1a2bException extends Exception {
    private int detail;

    public DoesNotEndWith1a2bException(String message, int detail) {
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
