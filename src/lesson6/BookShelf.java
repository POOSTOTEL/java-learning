package lesson6;

public class BookShelf {
    Book[] books = new Book[5];
    public BookShelf() {
    }
    public BookShelf (int size) {
        books = new Book[size];
    }
    public BookShelf (Book books[]) {
        this.books = books;
    }
//    public BookShelf (Book ...books) {
//        this.books = books;
//    }
}
