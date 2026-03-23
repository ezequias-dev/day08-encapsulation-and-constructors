package exercises;

class CatalogProduct {
    private String name;
    private double price;
    private boolean available;

    public CatalogProduct(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}

public class Exercise02 {
    public static void main(String[] args) {
        CatalogProduct product = new CatalogProduct("iPhone", 599.90, true);

        System.out.println("Initial price: " + product.getPrice());

        product.setPrice(499.90);
        System.out.println("After valid change: " + product.getPrice());

        product.setPrice(-13.55);
        System.out.println("After invalid change: " + product.getPrice());

        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Available: " + product.isAvailable());
    }
}