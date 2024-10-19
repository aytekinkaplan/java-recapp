package ch02_DataTypes_WrapperClass;

public class C05_RegexExpressions {

    public static void main(String[] args) {

        String str = "Java 12345 ? | >< $!";

        // \\d is a regular expression that matches any digit (0-9).
        System.out.println(str.replaceAll("\\d", "*"));  // Replaces all digits with *
        // Output: Java ***** ? | >< $!
        
        System.out.println("str = " + str);  
        // Output: Java 12345 ? | >< $!
        // Note: The original string remains unchanged because String is immutable in Java.

        // \\D matches any character that is not a digit (non-digit).
        System.out.println(str.replaceAll("\\D", "*"));  
        // Output: *****12345**********
        // Non-digit characters, including spaces, are replaced with *.

        // \\S matches any non-whitespace character.
        System.out.println(str.replaceAll("\\S", "*"));  
        // Output: **** ***** * * ** **
        // Only spaces are kept, everything else is replaced with *.

        // \\s matches any whitespace character (like spaces).
        System.out.println(str.replaceAll("\\s", "*"));  
        // Output: Java*12345*?*|*><*$!
        // All spaces are replaced with *.

        // \\w matches any word character (letters, digits, or underscores) [a-zA-Z0-9_].
        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));
        // Output: **** ***** ? | >< $!
        // Letters and digits are replaced, but special characters and spaces are kept.

        // \\W matches any character that is not a word character.
        System.out.println(str.replaceAll("\\W", "*"));  
        // Output: Java*12345**********
        // All special characters are replaced with *, leaving only letters and digits.

        // Demonstrating immutability of strings: the original string remains unchanged.
        System.out.println("str = " + str);  
        // Output: Java 12345 ? | >< $!

        // Store the result of replacing non-word characters in a new string.
        String str2 = str.replaceAll("\\W", "*****");
        System.out.println("str2 = " + str2);  
        // Output: Java*****12345**************************************************

    }
}
