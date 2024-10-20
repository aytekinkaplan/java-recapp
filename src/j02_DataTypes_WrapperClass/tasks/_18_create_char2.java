package j02_DataTypes_WrapperClass.tasks;

public class _18_create_char2 {

    public static void main(String[] args) {

        /* Create a char with the value 'z'.
           Print the char. */

        // Example 1: Char with value 'z'
        char c = 'z';
        System.out.println("Char value: " + c);

        // Example 2: Char with a different value
        char anotherChar = 'b';
        System.out.println("Another char value: " + anotherChar);

        // Example 3: Char with a number value (ASCII)
        char numberChar = 97;  // ASCII value of 'a'
        System.out.println("Char from ASCII value 97: " + numberChar);

        // Example 4: Char with a special symbol
        char symbolChar = '@';
        System.out.println("Special char: " + symbolChar);

        // Example 5: Printing the previous character in the alphabet
        char previousChar = (char) (c - 1);  // Moving to the previous char ('y')
        System.out.println("Previous char before 'z': " + previousChar);
    }
}
