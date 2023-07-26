package homework12.userAccount;

public class WrongLoginException extends Exception {
    private int detail;

    public WrongLoginException(String message, int detail) {
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
