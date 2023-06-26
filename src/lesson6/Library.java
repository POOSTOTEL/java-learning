package lesson6;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Diamond horsecar";
        book1.numberOfPages = 521;
        book1.author = "Akunin";
        book1.firstLetterInName = 'D';
        book1.weHasThisBookInLibrary = true;
        Book book2 = new Book("Book", "Pushkin", 'B', false, 123);
    }
}
