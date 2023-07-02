package homework7.sellary;

import java.util.Random;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    protected double averageMark;
    public Student () {
    }
    public Student (String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getGroup() {
        return this.group;
    }

    public double getAverageMark() {
        return this.averageMark;
    }
    protected int scholarship () {
        if (this.averageMark >= 5) {
            return 50;
        } else {
            return 10;
        }
    }
    public void print () {
        System.out.println("Student");
        System.out.println("Firstname: " + this.getFirstName());
        System.out.println("Lastname: " + this.getLastName());
        System.out.println("Group number " + this.getGroup());
        System.out.println("Average mark: " + this.averageMark);
        System.out.println();
    }
}
