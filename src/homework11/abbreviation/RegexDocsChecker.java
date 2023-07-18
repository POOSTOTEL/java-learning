package homework11.abbreviation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDocsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write document number: ");
        String line = scanner.nextLine();
        //Проверка номера документа
        Pattern pattern0 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher matcher0 = pattern0.matcher(line);
        if (matcher0.find()) {
            System.out.println(matcher0.group());
        }
        System.out.println("Write phone number: ");
        line = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher matcher1 = pattern1.matcher(line);
        if (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println("Write e-mail: ");
        line = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("\\b[a-zA-Z0-9]\\w*@[a-zA-Z]+\\.[a-z]{2,}\\b");
        Matcher matcher2 = pattern2.matcher(line);
        if (matcher2.find()) {
            System.out.println(matcher2.group());
        }

    }
}
