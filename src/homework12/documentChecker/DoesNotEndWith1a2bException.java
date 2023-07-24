package homework12.documentChecker;

public class DoesNotEndWith1a2bException extends Exception {
    private String detail;

    public DoesNotEndWith1a2bException(String message, String detail) {
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
