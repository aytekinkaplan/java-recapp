package j02_DataTypes_WrapperClass.tasks;

public class _15_create_short2 {

    public static void main(String[] args) {

        /* Create a short with value 23.
           Print the short. */

        // Example 1: Short with value 23
        short number = 23;
        System.out.println("Short value: " + number);

        // Example 2: Another short value
        short anotherNumber = 15;
        System.out.println("Another short value: " + anotherNumber);

        // Example 3: Adding two short values
        short sum = (short) (number + anotherNumber);  // Typecasting required to sum short values
        System.out.println("Sum of the two shorts: " + sum);

        // Example 4: Subtracting two short values
        short difference = (short) (number - anotherNumber);  // Typecasting required for subtraction
        System.out.println("Difference between the two shorts: " + difference);

        // Example 5: Multiplying a short value
        short product = (short) (number * 2);  // Typecasting required for multiplication
        System.out.println("Product of the short and 2: " + product);
    }
}
