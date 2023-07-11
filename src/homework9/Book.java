package homework9;

public class Book {
    private String title;
    private String author;
    private static String library = "National library";
    protected static int amountBooks;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public static int getAmountBooks() {
        return amountBooks;
    }

    static void printLibrary() {
        System.out.println("Все книги принадлежат: " + library);
    }
}
