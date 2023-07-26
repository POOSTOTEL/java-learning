package lesson13.task3StudentSerialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private char sex;
    private static int numberOfStudents = 0;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
