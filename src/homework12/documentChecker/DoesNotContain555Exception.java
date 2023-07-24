package homework12.documentChecker;

public class DoesNotContain555Exception extends Exception {
    private int detail;

    public DoesNotContain555Exception(String message, int detail) {
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
