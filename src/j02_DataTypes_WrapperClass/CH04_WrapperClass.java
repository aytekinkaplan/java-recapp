package ch02_DataTypes_WrapperClass;

public class CH04_WrapperClass {
    public static void main(String[] args) {

        /*
            Java introduced "Wrapper Classes" to allow primitive data types to behave like objects
            and to provide useful methods.

            - A Wrapper Class is a way to wrap a primitive data type in an object.
            - This gives primitive types additional functionality, such as converting between types or working with collections.

            ** Primitive Types and Their Wrapper Classes:
            Primitive       Wrapper Class
            ---------       --------------
            byte     ==>    Byte
            short    ==>    Short
            int      ==>    Integer
            long     ==>    Long
            float    ==>    Float
            double   ==>    Double
            boolean  ==>    Boolean
            char     ==>    Character
         */

        // Example 1: Converting primitive to Wrapper (Autoboxing)
        int age = 33; 
        Integer ageWrapper = Integer.valueOf(age);  // Autoboxing: primitive int to Integer object

        System.out.println("Age in wrapper: " + ageWrapper); // Output: 33

        // Example 2: Using methods from the Wrapper class (e.g., String to integer conversion)
        String number = "12345";  // String value to be converted to Integer

        int parsedNumber = Integer.parseInt(number);  // Converting String to primitive int
        System.out.println("Parsed number: " + parsedNumber); // Output: 12345

        Integer wrappedNumber = Integer.valueOf(number);  // Converting String to Integer object
        System.out.println("Wrapped number: " + wrappedNumber); // Output: 12345

        // TASK: Add two string-based integers together
        String tc = "123456789";
        String id = "12345";

        int tcNumber = Integer.parseInt(tc);  // Convert String to int
        int idNumber = Integer.parseInt(id);  // Convert String to int
        System.out.println("Sum of tc and id: " + (tcNumber + idNumber));  // Output: 123469134

        // TASK: Handling conversion errors
        String invalidNumber = "12345AB";  // This string contains non-numeric characters
        try {
            int invalidParsed = Integer.parseInt(invalidNumber);  // This will throw a NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert invalid number string: " + invalidNumber);
        }

        // Example 3: Maximum and Minimum values of primitive types using Wrapper Classes
        System.out.println("Max Byte Value: " + Byte.MAX_VALUE);  // Output: 127
        System.out.println("Min Byte Value: " + Byte.MIN_VALUE);  // Output: -128

        System.out.println("Max Integer Value: " + Integer.MAX_VALUE);  // Output: 2147483647
        System.out.println("Min Integer Value: " + Integer.MIN_VALUE);  // Output: -2147483648

        // Example 4: Autoboxing and Unboxing
        // Autoboxing: Java automatically converts a primitive to its Wrapper class
        boolean bPrimitive = true;
        Boolean bWrapper = bPrimitive;  // Autoboxing

        // Unboxing: Java automatically converts a Wrapper class back to its primitive type
        Integer numberWrapper = 55;  // Wrapper class (Integer)
        int numberPrimitive = numberWrapper;  // Unboxing: Integer to int

        System.out.println("Wrapper class to primitive: " + numberPrimitive);  // Output: 55
    }
}
