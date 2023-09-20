package org.example;

public class Author {
    private String lastName;
    private String firstName;
    private String nationality;
    private int yearOfBirth;
    private int yearOfDeath;

    public Author(String lastName, String firstName, String nationality, int yearOfBirth, int yearOfDeath) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}
