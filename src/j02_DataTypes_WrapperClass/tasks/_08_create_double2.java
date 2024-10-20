package j02_DataTypes_WrapperClass.tasks;

public class _08_create_double2 {

    public static void main(String[] args) {

        /* Create a double with the value 120.005.
           Print the double. */

        // Example 1: Double with value 120.005
        double number = 120.005;
        System.out.println("Double value: " + number);

        // Example 2: Another double with a decimal value
        double anotherNumber = 99.999;
        System.out.println("Another double value: " + anotherNumber);

        // Example 3: Double resulting from a mathematical operation
        double sum = number + anotherNumber;
        System.out.println("Sum of two doubles: " + sum);

        // Example 4: Double resulting from a multiplication
        double product = number * 2.5;
        System.out.println("Product of number and 2.5: " + product);

        // Example 5: Rounding a double value
        double roundedNumber = Math.round(number * 100.0) / 100.0;
        System.out.println("Rounded double value: " + roundedNumber);
    }
}
