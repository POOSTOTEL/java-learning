package lesson6;

import lesson5.SortTwoDimMas;

public class Book {
    String name;
    String author;
    char firstLetterInName;
    static boolean weHasThisBookInLibrary;
    int numberOfPages;
    public Book () {
        System.out.println("First constructor is called");
        numberOfPages = 101;
        weHasThisBookInLibrary = true;
    }
    public Book (String name, String author, char firstLetterInName, boolean weHasThisBookInLibrary, int numberOfPages) {
        System.out.println("Second constructor is called");
        this.name = name;
        this.author = author;
        this.firstLetterInName = firstLetterInName;
        this.weHasThisBookInLibrary = weHasThisBookInLibrary;
        this.numberOfPages = numberOfPages;
    }
    public void setWeHasThisBookInLibrary(boolean weHasThisBookInLibrary) {
        if (!weHasThisBookInLibrary) {
            System.out.println("It's is already taken");
        } else {
            this.weHasThisBookInLibrary = false;
        }
    }
}
