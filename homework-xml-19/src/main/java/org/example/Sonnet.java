package org.example;

import java.util.ArrayList;

public class Sonnet {
    private String type;
    private Author author;
    private String title;
    private ArrayList<String> lines = new ArrayList<>();

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAuthor(String lastName, String firstName, String nationality, int yearOfBirth, int yearOfDeath) {
        this.author = new Author(lastName, firstName, nationality, yearOfBirth, yearOfDeath);
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "type='" + type + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", lines=" + lines +
                '}';
    }
}
