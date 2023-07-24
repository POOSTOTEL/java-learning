package homework12.userAccount;

public class PasswordComparator {
    public static boolean check(String password, String confirmPassword) {
        try {
            if (!password.equals(confirmPassword)) {
                throw new WrongComparisonException("Пароли не совпали!!!", 505);
            } else {
                return true;
            }

        } catch (WrongComparisonException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
