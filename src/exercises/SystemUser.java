package exercises;

public class SystemUser {
    private String fullName;
    private String email;
    private boolean active;

    public SystemUser(String fullName, String email, boolean active) {
        this.fullName = fullName;
        this.email = email;
        this.active = active;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public void showUserSummary() {
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + getEmail());
        System.out.println("Active: " + isActive());
    }
}