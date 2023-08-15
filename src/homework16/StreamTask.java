package homework16;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        Random random = new Random();
        final int SIZE = 25;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            array.add(random.nextInt(0, 25));
        }
        System.out.println(array);
        //Удалить дубликаты
        System.out.println(array.stream().distinct().collect(Collectors.toList()));
        //Выбрать чётные в диапазоне
        System.out.println(array.stream().filter(num -> (num >= 7 && num <= 17 && num % 2 == 0)).collect(Collectors.toSet()));
        //Умножить на 2
        System.out.println(array.stream().map(num -> num * 2).collect(Collectors.toList()));
        //Отсортировать
        System.out.println(array.stream().sorted().collect(Collectors.toList()));
        //Вывести первых 4
        System.out.println(array.stream().limit(4).collect(Collectors.toList()));
        //Найти сумму элементов
        System.out.println(array.stream().reduce((num1, num2) -> num1 + num2).get());
    }
}
