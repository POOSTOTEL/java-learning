package homework15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class After100Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Я не могу понять почему формат "dd.MMMM.yyyy" не работает
        String format = "dd.MM.yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println(birthDate.plusYears(100).format(formatter));
    }
}
