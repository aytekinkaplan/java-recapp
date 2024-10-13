package class01;

public class java01_methods02 {
    public static void main(String[] args) {
        greet();

        // Provide example parameters
        int a = 5;
        int b = 10;

        calculate(a, b);
    }

    // Data types for parameters should be specified
    private static void calculate(int a, int b) {
        // Addition operation
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Multiplication operation
        int product = a * b;
        System.out.println("Product: " + product);

        // Subtraction operation
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Division operation
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);
    }

    private static void greet() {
        System.out.println("Hello");
    }
}
