package homework12.userAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean check(String password) {
        Pattern pattern1 = Pattern.compile("\\s+");
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(password);
        Matcher matcher2 = pattern2.matcher(password);
        try {
            if (matcher1.find() || !matcher2.find() || password.length() >= 20) {
                throw new WrongLoginException("Формат пароля не удовлетворяет стандарту.", 404);
            } else {
                System.out.println("Пароль корректный и внесён в базу.");
                return true;
            }
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
