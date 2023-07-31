package homework14.university;

import java.util.ArrayList;

public class StudentCourseService {
    public static void upgradeCourse(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageValue() < 3) {
                students.remove(i);
            } else {
                students.get(i).course++;
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            int value = students.get(i).course;
            if (value == course) {
                System.out.println(students.get(i).toString());
            }
        }
    }
}
