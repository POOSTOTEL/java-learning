package homework16;

import java.util.Optional;
import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write phrase: ");
        checkLine(scanner.nextLine());
    }

    public static void checkLine(String str) {
        Optional<String> opt = Optional.of(str);
        opt.ifPresent(System.out::println);
        if (opt.get().length() > 4) {
            System.out.println(opt.get().substring(0, 4));
        } else {
            System.out.print("JAVA");
        }
    }
}
