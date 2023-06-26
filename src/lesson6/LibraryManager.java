package lesson6;

public class LibraryManager {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Diamond horsecar";
        book1.numberOfPages = 521;
        book1.author = "Akunin";
        book1.firstLetterInName = 'D';
        book1.weHasThisBookInLibrary = true;
        printBook(book1);
        Book book2 = new Book("Book", "Pushkin", 'B', false, 123);
        printBook(book2);
        book2.setWeHasThisBookInLibrary(true);
        Book[] bookArray = {book1, book2};
        BookShelf bookShelf = new BookShelf(bookArray);
        System.out.println(bookShelf.books);
        bookShelf.books[0] = new Book();
    }
    public static void printBook(Book book) {
        System.out.println(book.name + " "
                + book.author + " "
                + book.firstLetterInName + " "
                + book.weHasThisBookInLibrary + " "
                + book.numberOfPages);
    }
}
