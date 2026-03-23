package exercises;

class CustomerProfile {
    private String name;
    private String email;
    private String city;

    public CustomerProfile(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void showProfile() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("City: " + getCity());
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        CustomerProfile customer = new CustomerProfile("Ezequias", "user@email.com", "Curitiba");
        customer.showProfile();

        System.out.println();
        System.out.println("---- Updated profile ----");

        customer.setCity("Salvador");
        customer.showProfile();
    }
}