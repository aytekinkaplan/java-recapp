package j17_PassByValue;

public class C01_PassByValue_Reference {
    public static void main(String[] args) {

        /*
        Java is a Pass-By-Value programming language.
        When a primitive variable is passed as an argument to a method,
        only a copy of its value is passed, not the variable itself.
        This means changes inside the method will not affect the original variable.

        Pass-by-value example: Suppose we have a cup, and we are drinking coffee from it.
        Our friend also wants to drink coffee, but the cup has only one handle,
        and only one person can hold it. So, instead of giving the cup itself,
        we make a copy of it and give it to our friend. Any changes made to the copied cup
        do not affect the original cup.

        Pass-by-reference example: Suppose we have a cup with two handles,
        allowing both people to hold it at the same time.
        If we make any changes to the cup, both people are affected since they are holding
        the same cup.

        In Java, primitive data types (int, float, boolean, etc.) are handled as pass-by-value,
        meaning changes to their values inside methods do not affect the original variable.

        Reference data types (String, List, Object, etc.), on the other hand, are passed by value as well,
        but the value is a reference (memory address) to the object, not the object itself.
        Even though it seems like pass-by-reference, it's still pass-by-value of the reference.

        */

        // Primitive Type Example (int)
        int x = 10;
        System.out.println("Before method call, x = " + x);
        incrementInt(x);
        System.out.println("After method call, x = " + x); // Expected: 10

        // Reference Type Example (String)
        String text = "hello";
        System.out.println("\nBefore method call, text = " + text);
        changeString(text);
        System.out.println("After method call, text = " + text); // Expected: hello

        // Pass-by-Value Example with double
        double price = 100.0;
        System.out.println("\nBefore method call, price = " + price);
        increasePrice(price);
        System.out.println("After method call, price = " + price); // Expected: 100.0

        // Additional Example with Array (Reference Type)
        int[] numbers = {1, 2, 3};
        System.out.println("\nBefore method call, array = " + arrayToString(numbers));
        modifyArray(numbers);
        System.out.println("After method call, array = " + arrayToString(numbers)); // Expected: Modified Array

        // Additional Example with Integer Wrapper (Immutable)
        Integer num = 50;
        System.out.println("\nBefore method call, num = " + num);
        modifyInteger(num);
        System.out.println("After method call, num = " + num); // Expected: 50

    }

    // Method that modifies an int (primitive type)
    private static void incrementInt(int x) {
        x += 10;
        System.out.println("Inside method, x = " + x); // Expected: 20
    }

    // Method that modifies a String (immutable reference type)
    private static void changeString(String s) {
        s = "world";
        System.out.println("Inside method, text = " + s); // Expected: world
    }

    // Method that increases a double by 24%
    private static void increasePrice(double price) {
        price *= 1.24;
        System.out.println("Inside method, price = " + price); // Expected: 124.0
    }

    // Method that attempts to modify an array (reference type)
    private static void modifyArray(int[] arr) {
        arr[0] = 99;
        System.out.println("Inside method, array = " + arrayToString(arr)); // Expected: Modified Array
    }

    // Method to modify Integer (an immutable reference type)
    private static void modifyInteger(Integer num) {
        num += 20;
        System.out.println("Inside method, num = " + num); // Expected: 70
    }

    // Helper method to convert an array to a readable string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(n).append(" ");
        }
        return sb.toString().trim();
    }
}
