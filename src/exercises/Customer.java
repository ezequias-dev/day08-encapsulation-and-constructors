package exercises;

public class Customer {
    private String fullName;
    private String email;

    public Customer(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    void showSummary() {
        System.out.println("Customer: " + fullName);
        System.out.println("Email: " + email);
    }
}