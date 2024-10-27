package j07_StringManipulations;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {

        /*
         * replace() and replaceAll() Methods:
         * - replace(): Replaces a specified character or substring with another character or substring.
         *   - Accepts both char and String parameters, and returns a modified String.
         * - replaceAll(): Similar to replace(), but with two main differences:
         *   1. It only accepts String arguments (not char).
         *   2. It supports regular expressions (regex) for advanced replacements.
         *
         * Regular Expressions (regex) Examples:
         * - \\s : Matches whitespace
         * - \\S : Matches any non-whitespace character
         * - \\w : Matches any word character (alphanumeric + underscore)
         * - \\W : Matches any non-word character
         * - \\d : Matches any digit (0-9)
         * - \\D : Matches any non-digit
         */

        String str = "Memorizing is a betrayal to the brain 12345 ^#^%$ () :";

        // Basic replace() examples
        System.out.println("str.replace('a' , '$') = " + str.replace('a', '$'));
        // Replaces all 'a' characters with '$'

        System.out.println("str.replace(\"tion\", \"*\") = " + str.replace("tion", "*"));
        // Replaces the substring "tion" with "*"

        System.out.println("str.replaceFirst(\"e\", \"*\") = " + str.replaceFirst("e", "*"));
        // Replaces only the first occurrence of "e" with "*"

        // replaceAll() with regex examples
        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));
        // Replaces all word characters (alphanumeric and underscore) with '*'

        System.out.println("str.replaceAll(\"\\\\W\",\"*\") = " + str.replaceAll("\\W", "*"));
        // Replaces all non-word characters with '*'

        // Replace only alphabetic characters with '*'
        System.out.println("str.replaceAll(\"[A-Za-z]\" , \"*\") = " + str.replaceAll("[A-Za-z]", "*"));

        // Task: Masking Personal Information
        // Format example:
        // - Name and Surname: J***** D*******
        // - Credit Card No: **** **** **** 1234

        String firstName = "Jessica";
        String lastName = "Doe";
        String creditCardNo = "1234567891234567";

        // Mask first name
        String maskedFirstName =
                firstName.charAt(0) +  // First character
                        firstName.substring(1).replaceAll("\\w", "*"); // Remaining characters replaced with '*'
        System.out.println("Masked First Name: " + maskedFirstName); // Output: J*****

        // Mask last name
        String maskedLastName =
                lastName.charAt(0) +
                        lastName.substring(1).replaceAll("\\w", "*");
        System.out.println("Masked Last Name: " + maskedLastName); // Output: D****

        // Mask credit card number (show only last 4 digits)
        String maskedCreditCard = "**** **** **** " + creditCardNo.substring(12);
        System.out.println("Masked Credit Card No: " + maskedCreditCard); // Output: **** **** **** 4567

        // Another way to mask credit card using regex
        String maskedCreditCardRegex = creditCardNo.substring(0, 12).replaceAll("[0-9]", "*") + creditCardNo.substring(12);
        System.out.println("Masked Credit Card (Regex): " + maskedCreditCardRegex); // Output: **** **** **** 4567

        // Masked Full Name in a single variable
        String fullMaskedName = maskedFirstName + " " + maskedLastName;
        System.out.println("Full Masked Name: " + fullMaskedName); // Output: J***** D****

        /*
         * Explanation:
         * - replace() and replaceAll() are powerful for text substitution.
         * - replaceAll() allows for regex, making it ideal for patterns like masking or text cleaning.
         * - The ability to selectively replace characters using regex makes these methods versatile for data protection and transformation.
         */
    }
}
