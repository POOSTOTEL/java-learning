package Lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello student!\n");
        System.out.println("Hello student!");
        //Объявление переменной
        int number, number2, b;
        //Инициализация переменных (Присваивание значений)
        number = 123546;
        number2 = 6454684;

        int num = 100;
        byte sum = (byte)(number + number2);
        int minus = number - number2;
        int proisvedenie = number * number2;
        int divide = number / number2;
        int lostAfterDivision = number % number2;

        System.out.println("+ " + sum);
        System.out.println("- " + minus);
        System.out.println("* " + proisvedenie);
        System.out.println("/ " + divide);
        System.out.println("% " + lostAfterDivision);

        char character = '#';

        int num1 = 3, num2 = 5;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}