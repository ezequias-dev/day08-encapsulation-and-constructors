package challenge;

import java.util.Scanner;

public class Day08Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Active user? (true/false): ");
        boolean active = scanner.nextBoolean();

        UserProfile user = new UserProfile(fullName, email, password, active);
        user.showProfileSummary();

        if (user.isValidProfile()) {
            System.out.println("Valid profile");
        } else {
            System.out.println("Invalid profile");
        }

        scanner.close();
    }
}