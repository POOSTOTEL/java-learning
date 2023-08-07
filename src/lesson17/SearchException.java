package lesson17;

public class SearchException extends Exception {
    private String description;

    public SearchException(String message, String description) {
        super(message);
        this.description = description;
    }

    @Override
    public String toString() {
        return "SearchException{" +
                "description='" + description + '\'' +
                '}';
    }
}
