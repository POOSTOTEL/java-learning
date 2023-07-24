package homework12.userAccount;

public class UserAccount {
    private String login;
    private String password;
    private String confirmPassword;

    public UserAccount() {
        this.login = "login";
        this.password = "password";
        this.confirmPassword = "password";
    }

    public UserAccount(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
