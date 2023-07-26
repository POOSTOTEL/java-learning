package homework12.userAccount;

import java.util.Scanner;

public class UserAccountRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Зарегистрируйте свой новый аккаунт:");
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        System.out.println("Воспроизведите пароль заново:");
        String confirmPassword = scanner.nextLine();
        if (LoginValidator.check(login) && PasswordValidator.check(password) && PasswordComparator.check(password, confirmPassword)) {
            UserAccount userAccount = new UserAccount(login, password, confirmPassword);
            System.out.println("Все данные верны, аккаунт создан!");
            System.out.println(userAccount.toString());
        } else {
            UserAccount userAccount = new UserAccount();
            System.out.println("Вы нарушили формат ввода, вот пример для заполнения данных:");
            System.out.println(userAccount.toString());
        }

    }
}
