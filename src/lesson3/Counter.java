package lesson3;

public class Counter {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i*10);
        }
        System.out.println();
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 100; i >= 0; i -= 10) {
            System.out.println(i);
        }
        System.out.println();
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }
        System.out.println();
        do {
            System.out.println(i++);
        } while (i < 10);
    }
}
