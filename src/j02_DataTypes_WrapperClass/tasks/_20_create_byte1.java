package j02_DataTypes_WrapperClass.tasks;

public class _20_create_byte1 {

    public static void main(String[] args) {

        /* Create a byte with the value 5.
           Print the byte. */

        // Example 1: Byte with value 5
        byte number = 5;
        System.out.println("Byte value: " + number);

        // Example 2: Another byte value
        byte anotherNumber = 10;
        System.out.println("Another byte value: " + anotherNumber);

        // Example 3: Sum of two bytes (typecasting required)
        byte sum = (byte) (number + anotherNumber);
        System.out.println("Sum of the two bytes: " + sum);

        // Example 4: Difference between two bytes (typecasting required)
        byte difference = (byte) (number - anotherNumber);
        System.out.println("Difference between the two bytes: " + difference);

        // Example 5: Multiplication of a byte (typecasting required)
        byte product = (byte) (number * 2);
        System.out.println("Product of the byte and 2: " + product);
    }
}
