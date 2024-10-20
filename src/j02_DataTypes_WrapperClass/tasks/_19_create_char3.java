package j02_DataTypes_WrapperClass.tasks;

public class _19_create_char3 {

    public static void main(String[] args) {

        /* Create a char with the value '&'.
           Print the char. */

        // Example 1: Char with value '&'
        char c = '&';
        System.out.println("Char value: " + c);

        // Example 2: Char with another special character
        char anotherChar = '%';
        System.out.println("Another special char: " + anotherChar);

        // Example 3: Char with a letter
        char letterChar = 'X';
        System.out.println("Letter char: " + letterChar);

        // Example 4: Char with an ASCII number value
        char numberChar = 36;  // ASCII value of '$'
        System.out.println("Char from ASCII value 36: " + numberChar);

        // Example 5: Combining two chars into a string
        String combinedChars = "" + c + anotherChar;
        System.out.println("Combined chars: " + combinedChars);
    }
}
