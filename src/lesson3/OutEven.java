package lesson3;

public class OutEven {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i > 10) {
                System.out.println(i);
            }
        }
    }
}
