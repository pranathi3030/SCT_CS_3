import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Password Strength Checker ===");
        System.out.print("Enter your password: ");

        String password = sc.nextLine();

        int score = 0;

        // Length
        if (password.length() >= 8) {
            score++;
        } else {
            System.out.println("Weak: Password should have at least 8 characters");
        }

        // Uppercase
        if (password.matches(".*[A-Z].*")) {
            score++;
        } else {
            System.out.println("Missing uppercase letter");
        }

        // Lowercase
        if (password.matches(".*[a-z].*")) {
            score++;
        } else {
            System.out.println("Missing lowercase letter");
        }

        // Numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        } else {
            System.out.println("Missing number");
        }

        // Special characters
        if (password.matches(".*[!@#$%^&*].*")) {
            score++;
        } else {
            System.out.println("Missing special character");
        }


        if (score == 5) {
            System.out.println("\nStrength: STRONG PASSWORD");
        }
        else if (score >= 3) {
            System.out.println("\nStrength: MEDIUM PASSWORD");
        }
        else {
            System.out.println("\nStrength: WEAK PASSWORD");
        }

        sc.close();
    }
}