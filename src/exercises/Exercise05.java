package exercises;

class Order {
    private String code;
    private String customerName;
    private double totalAmount;

    public Order(String code, String customerName, double totalAmount) {
        this.code = code;
        this.customerName = customerName;
        setTotalAmount(totalAmount);
    }

    public String getCode() {
        return code;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount >= 0) {
            this.totalAmount = totalAmount;
        }
    }

    public boolean isValidOrder() {
        return totalAmount > 0;
    }

    public void showOrderSummary() {
        System.out.println("Code: " + getCode());
        System.out.println("Customer name: " + getCustomerName());
        System.out.printf("Total amount: %.2f%n", getTotalAmount());
        System.out.println("Is the order valid? " + isValidOrder());
    }
}

public class Exercise05 {
    public static void main(String[] args) {
        Order order = new Order("2368", "Pedro", 500);

        order.showOrderSummary();

        System.out.println();
        System.out.println("---- Updated data ----");
        order.setTotalAmount(9000);
        order.showOrderSummary();

        System.out.println();
        System.out.println("---- Invalid update attempt ----");
        order.setTotalAmount(-9000);
        order.showOrderSummary();
    }
}