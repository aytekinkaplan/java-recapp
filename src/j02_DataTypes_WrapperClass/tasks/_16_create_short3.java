package j02_DataTypes_WrapperClass.tasks;

public class _16_create_short3 {

    public static void main(String[] args) {

        /* Create a short with the value -100.
           Print the short. */

        // Example 1: Short with value -100
        short number = -100;
        System.out.println("Short value: " + number);

        // Example 2: Another short value
        short anotherNumber = 50;
        System.out.println("Another short value: " + anotherNumber);

        // Example 3: Sum of two shorts
        short sum = (short) (number + anotherNumber);  // Typecasting required for addition
        System.out.println("Sum of the two shorts: " + sum);

        // Example 4: Difference between two shorts
        short difference = (short) (number - anotherNumber);  // Typecasting required for subtraction
        System.out.println("Difference between the two shorts: " + difference);

        // Example 5: Multiplying a short
        short product = (short) (number * 2);  // Typecasting required for multiplication
        System.out.println("Product of the short and 2: " + product);
    }
}
