package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input counter: ");
        int sum = 0, counter = scanner.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i);
            //Мне кажется, что оформление вывода можно было сделать как-то более оптимально,
            //миновав при этом постоянные логические проверки.
            if (counter != i) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            sum += i;
        }
        System.out.print(sum);
    }
}
