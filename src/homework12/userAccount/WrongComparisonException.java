package homework12.userAccount;

public class WrongComparisonException extends Exception {
    private int detail;

    public WrongComparisonException(String message, int detail) {
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
