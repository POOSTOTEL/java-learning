package homework11.abbreviation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write line: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
