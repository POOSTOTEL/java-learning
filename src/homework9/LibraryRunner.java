package homework9;

public class LibraryRunner {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Ivanov A. P. ", 1245);
        readers[1] = new Reader("Petrov B. S. ", 7842);
        readers[2] = new Reader("Pavlov U. E. ", 6478);
        Book[] books = new Book[3];
        books[0] = new Book("Star wars ", "Pushkin A. S. ");
        books[1] = new Book("Cars ", "Fridrig A. P. ");
        books[2] = new Book("War and life ", "Tolstoi H. M. ");
        String[] booksString = {"Ferry ", "How build house "};
        readers[0].takeBook(10);
        readers[0].takeBook(booksString);
        System.out.println("Total borrowed books in the library: " + Book.getAmountBooks());
        readers[0].takeBook(books);
        readers[1].takeBook(2);
        readers[2].takeBook("Holidays ", "Kingdoms ");
        System.out.println("Total borrowed books in the library: " + Book.getAmountBooks());
        Book.printLibrary();
    }
}
