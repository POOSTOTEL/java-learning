package homework12.userAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {
    public static boolean check(String login) {
        Pattern pattern1 = Pattern.compile("\\s");
        Matcher matcher1 = pattern1.matcher(login);
        try {
            if (matcher1.find() || login.length() >= 20) {
                throw new WrongLoginException("Формат логина не удовлетворяет стандарту.", 404);
            } else {
                System.out.println("Логин корректный и внесён в базу.");
                return true;
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
