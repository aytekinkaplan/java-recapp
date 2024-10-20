package j02_DataTypes_WrapperClass.tasks;

public class _17_create_char1 {

    public static void main(String[] args) {

        /* Create a char with the value 'a'.
           Print the char. */

        // Example 1: Char with value 'a'
        char c = 'a';
        System.out.println("Char value: " + c);

        // Example 2: Another char with a different value
        char anotherChar = 'z';
        System.out.println("Another char value: " + anotherChar);

        // Example 3: Char with a number value (ASCII value)
        char numberChar = 65;  // ASCII value of 'A'
        System.out.println("Char from ASCII value 65: " + numberChar);

        // Example 4: Char with a special character
        char specialChar = '#';
        System.out.println("Special char: " + specialChar);

        // Example 5: Printing the next character in the alphabet
        char nextChar = (char) (c + 1);  // Moving to the next char ('b')
        System.out.println("Next char after 'a': " + nextChar);
    }
}
