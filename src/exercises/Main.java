package exercises;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("MacBook", 799.90, 10);
        product.showDetails();

        System.out.println("----");

        product.setPrice(349.90);
        product.setStock(15);
        product.showDetails();

        System.out.println("----");

        Customer customer = new Customer("Ezequias Souza", "user@email.com");
        customer.showSummary();
    }
}