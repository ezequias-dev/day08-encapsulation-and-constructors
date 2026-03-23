package review;

public class UserAccount {
    String fullName;
    String email;
    String password;

    boolean isValidRegistration() {
        boolean isValidName = fullName != null && fullName.trim().length() >= 3;
        boolean isValidEmail = email != null && email.contains("@");
        boolean isValidPassword = password != null && password.length() >= 8;

        return isValidName && isValidEmail && isValidPassword;
    }

    void showAccountSummary() {
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password length: " + (password != null ? password.length() : 0));
    }
}
