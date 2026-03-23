package challenge;

public class UserProfile {
    private String fullName;
    private String email;
    private String password;
    private boolean active;

    public UserProfile(String fullName, String email, String password, boolean active) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isValidProfile() {
        boolean isValidName = fullName != null && fullName.trim().length() >= 3;
        boolean isValidEmail = email != null && email.contains("@");
        boolean isValidPassword = password != null && password.length() >= 8;

        return isValidName && isValidEmail && isValidPassword;
    }

    public void showProfileSummary() {
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Password length: " + (password != null ? password.length() : 0));
        System.out.println("Active: " + active);
    }
}