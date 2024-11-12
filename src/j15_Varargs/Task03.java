package j15_Varargs;

public class Task03 {
    public static void main(String[] args) {

        /*
        Task:
        Create a method that multiplies a given number by the length of the longest string
        from a variable number of input strings, then prints the result.
         */

        int number = 5;
        longestStringLengthProduct(number, "apple", "banana", "strawberry", "kiwi");
    }

    public static void longestStringLengthProduct(int multiplier, String... strings) {
        int maxLength = 0;

        // Find the longest string's length
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        // Calculate and print the result
        int result = maxLength * multiplier;
        System.out.println("Result of multiplying the longest string length by " + multiplier + " = " + result);
    }
}
