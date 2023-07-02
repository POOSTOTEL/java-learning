package homework7.sellary;

import java.awt.event.WindowStateListener;
import java.util.Random;
import java.util.Scanner;

public class InputMenu {
    public static Student[] start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array size: ");
        Student students[] = new Student[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            System.out.println("1. Создать студента.");
            System.out.println("2. Создать аспиранта.");
            switch (scanner.nextInt()) {
                case 1: {
                    students[i] = new Student("Inkognito", "Anonimus", random.nextInt(1, 10), random.nextDouble(0.0, 10.0));
//                    System.out.println((students[i] instanceof Student));
//                    System.out.println((students[i] instanceof Aspirant));
                    break;
                }
                case 2: {
                    students[i] = new Aspirant("Inkognito", "Anonimus", random.nextInt(1, 10), random.nextDouble(0.0, 10.0), random.nextBoolean());
//                    System.out.println((students[i] instanceof Student));
//                    System.out.println((students[i] instanceof Aspirant));
                    break;
                }
                default: {
                    System.out.println("Error input. \nCRASH!!!");
                    break;
                }
            }
            students[i].print();
        }
        for (int i = 0; i < students.length; i++) {

        }
        return students;
    }
}
