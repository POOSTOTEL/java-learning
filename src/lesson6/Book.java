package lesson6;

public class Book {
    String name;
    String author;
    char firstLetterInName;
    boolean weHasThisBookInLibrary;
    int numberOfPages;
    public Book () {
        System.out.println("First constructor is called");
        numberOfPages = 101;
    }
    public Book (String name, String author, char firstLetterInName, boolean weHasThisBookInLibrary, int numberOfPages) {
        System.out.println("Second constructor is called");
        this.name = name;
        this.author = author;
        this.firstLetterInName = firstLetterInName;
        this.weHasThisBookInLibrary = weHasThisBookInLibrary;
        this.numberOfPages = numberOfPages;
    }
}
