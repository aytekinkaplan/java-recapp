package j10_MethodCreation.tasks;

public class Task13 {

    public static void main(String[] args) {
        /*
        Task: Create a method that returns true if the second string matches the ending of the first string,
              otherwise returns false.

        Examples:
        checkEnding("abc", "bc") ➞ true
        checkEnding("abc", "d") ➞ false
        checkEnding("samurai", "zi") ➞ false
        checkEnding("feminine", "nine") ➞ true
        checkEnding("convention", "tio") ➞ false
        */

        // Test examples
        System.out.println(checkEnding("abc", "bc"));        // true
        System.out.println(checkEnding("abc", "d"));         // false
        System.out.println(checkEnding("samurai", "zi"));    // false
        System.out.println(checkEnding("feminine", "nine")); // true
        System.out.println(checkEnding("convention", "tio")); // false
    }

    // Method to check if the second string matches the ending of the first string
    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
    }
}
