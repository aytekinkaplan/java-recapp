package j12_Arrays.tasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Create a String: "Hello World"
        Print the String in reverse.
        Expected output: "dlroW olleH"
         */

        String str = "Hello World";

        // Using StringBuilder for efficient string reversal
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        System.out.println(reversedStr.toString());
    }
}
