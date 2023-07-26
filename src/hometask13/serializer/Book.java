package hometask13.serializer;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private Author author;
    int numOfPages;

    public Book(String name, String firstname, String lastname, int numOfPages) {
        this.name = name;
        this.author = new Author(firstname, lastname);
        this.numOfPages = numOfPages;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
