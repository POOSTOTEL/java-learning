package lesson13.task3StudentSerialization;

import java.io.*;

public class StudentRunner {
    private static final String FILENAME = "student.txt";

    public static void main(String[] args) {
        Student student = new Student("Alex", 19, 'M');
        writeSerializedStudent(student);
        Student deserializedStudent = readSerializedStudent();
        System.out.println(student);
        System.out.println(deserializedStudent);
    }

    private static void writeSerializedStudent(Student student) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            output.writeObject(student);
        } catch (IOException e) {
            System.out.println("Can not write to file " + e.getMessage());
        }
    }

    private static Student readSerializedStudent() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Student student = (Student) input.readObject();
            return student;
        } catch (IOException e) {
            System.out.println("Can not write to file " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Can not deserialized " + e.getMessage());
        }
        return null;
    }
}
