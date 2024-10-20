package j02_DataTypes_WrapperClass.tasks;

public class _14_create_short1 {

    public static void main(String[] args) {

        /* Create a short with the value 12.
           Print the short. */

        // Example 1: Short with value 12
        short number = 12;
        System.out.println("Short value: " + number);

        // Example 2: Another short value
        short anotherNumber = 45;
        System.out.println("Another short value: " + anotherNumber);

        // Example 3: Sum of two shorts
        short sum = (short) (number + anotherNumber);  // Typecasting to short is required for sum
        System.out.println("Sum of the two shorts: " + sum);

        // Example 4: Difference between two shorts
        short difference = (short) (number - anotherNumber);  // Typecasting required for difference
        System.out.println("Difference between the two shorts: " + difference);

        // Example 5: Multiplication of a short
        short product = (short) (number * 3);  // Typecasting required for multiplication
        System.out.println("Product of the short and 3: " + product);
    }
}
