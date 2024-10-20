package j02_DataTypes_WrapperClass.tasks;

public class _21_create_byte2 {

    public static void main(String[] args) {

        /* Create a byte with the value -4.
           Print the byte. */

        // Example 1: Byte with value -4
        byte byte1 = -4;
        System.out.println("Byte value: " + byte1);

        // Example 2: Another byte with a positive value
        byte anotherByte = 12;
        System.out.println("Another byte value: " + anotherByte);

        // Example 3: Sum of two bytes (typecasting required)
        byte sum = (byte) (byte1 + anotherByte);
        System.out.println("Sum of the two bytes: " + sum);

        // Example 4: Difference between two bytes (typecasting required)
        byte difference = (byte) (anotherByte - byte1);
        System.out.println("Difference between the two bytes: " + difference);

        // Example 5: Multiplication of a byte (typecasting required)
        byte product = (byte) (byte1 * 3);
        System.out.println("Product of the byte and 3: " + product);
    }
}
