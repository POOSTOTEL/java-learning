package homework14.university;

import java.util.ArrayList;

public class University {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Александр", 1234, 2, 9.5);
        Student student2 = new Student("Вероника", 1354, 4, 2.2);
        Student student3 = new Student("Екатерина", 1741, 1, 10.0);
        Student student4 = new Student("Павел", 2884, 2, 3.0);
        Student student5 = new Student("Николай", 6969, 3, 2.8);
        Student student6 = new Student("Мария", 1111, 1, 9.7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println(students.toString());
        StudentCourseService.upgradeCourse(students);
        System.out.println(students.toString());
        StudentCourseService.printStudents(students, 3);

    }
}
