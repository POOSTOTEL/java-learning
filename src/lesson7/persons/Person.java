package lesson7.persons;

public class Person {
    public String name;
    int age;
    private char gender;
    Person () {

    }
    public Person (String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
