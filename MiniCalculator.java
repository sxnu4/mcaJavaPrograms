import java.util.Scanner;

// Calculator class to handle basic and advanced operations
class Calculator {
    // Method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Method to calculate the modulus of two numbers
    public static double modulus(double a, double b) {
        return a % b;
    }

    // Method to calculate the power of a number
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Method to calculate the sine of a number
    public static double sine(double a) {
        return Math.sin(Math.toRadians(a));
    }

    // Method to calculate the cosine of a number
    public static double cosine(double a) {
        return Math.cos(Math.toRadians(a));
    }

    // Method to calculate the tangent of a number
    public static double tangent(double a) {
        return Math.tan(Math.toRadians(a));
    }
}

// Main class to test the Calculator
public class MiniCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mini Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");

        int choice = scanner.nextInt();

        double num1 = 0, num2 = 0;
        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
        } else if (choice >= 7 && choice <= 9) {
            System.out.print("Enter the number: ");
            num1 = scanner.nextDouble();
        }

        switch (choice) {
            case 1:
                System.out.println("Result: " + calc.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calc.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calc.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calc.divide(num1, num2));
                break;
            case 5:
                System.out.println("Result: " + calc.modulus(num1, num2));
                break;
            case 6:
                System.out.println("Result: " + calc.power(num1, num2));
                break;
            case 7:
                System.out.println("Result: " + calc.sine(num1));
                break;
            case 8:
                System.out.println("Result: " + calc.cosine(num1));
                break;
            case 9:
                System.out.println("Result: " + calc.tangent(num1));
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
                break;
        }

        scanner.close();
    }
}
