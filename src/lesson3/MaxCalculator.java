package lesson3;

public class MaxCalculator {
    public static void main(String[] args) {
        int x = 10, y = 20, max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        max = x > y ? x : y;
        max = x > y
                ? x
                : y;

    }
}
