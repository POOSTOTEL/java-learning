package homework9;

public class Reader {
    private String name;
    private int libraryCardNumber;

    public Reader(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
    }

    void takeBook(int amount) {
        System.out.println(name + "взял/а " + amount);
        Book.amountBooks += amount;
    }

    void takeBook(String... books) {
        System.out.print(name + "взял/а: ");
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();
        Book.amountBooks += books.length;
    }

    void takeBook(Book... books) {
        System.out.print(name + "взял/а: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " ");
        }
        System.out.println();
        Book.amountBooks += books.length;
    }
}
