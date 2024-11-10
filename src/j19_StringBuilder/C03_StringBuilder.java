package j19_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        // Comparison of String and StringBuilder

        /*
        The `compareTo` method compares two `StringBuilder` objects to check if they are equal.
        It compares each character from the first to the last character.
        If the characters are the same, it does not return anything, but for the first different character,
        it returns the difference in ASCII values of the characters.
        If they are completely identical, it returns 0.

        Note: Comparing a `StringBuilder` with a `String` using `compareTo` will result in a compile-time error (CTE) in Java.
         */

        StringBuilder sb1 = new StringBuilder("javAslan");
        StringBuilder sb2 = new StringBuilder("javAslan");
        String s = "javAslan";

        // Using compareTo to compare two StringBuilder objects
        System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(sb2)); // Output: sb1.compareTo(sb2) = 0

        // Uncommenting the line below will cause a compile-time error because `compareTo` cannot compare StringBuilder to String
        // System.out.println("sb2.compareTo(s) = " + sb2.compareTo(s));

        // Using equals to compare two StringBuilder objects
        System.out.println("sb1.equals(sb2) = " + sb1.equals(sb2)); // Output: sb1.equals(sb2) = false

        // Converting StringBuilder to String and using equals to compare content
        System.out.println("sb1.toString().equals(sb2.toString()) = " +
                sb1.toString().equals(sb2.toString())); // Output: sb1.toString().equals(sb2.toString()) = true
    }
}
