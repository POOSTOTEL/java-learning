package semestr2homework1.models;

public class Person {
    private String name;
    private String lastname;
    private String gender;
    private int age;

    public Person(String name, String lastname, String gender, int age) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
