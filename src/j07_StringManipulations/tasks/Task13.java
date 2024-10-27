package j07_StringManipulations.tasks;

public class Task13 {
    public static void main(String[] args) {

        // Example 1: Count the number of characters in a string excluding spaces.
        //            "Ali okula gitti." ==> 14
        String example1 = "Ali okula gitti.";
        int charCountWithoutSpaces = example1.replace(" ", "").length();
        System.out.println("Number of characters excluding spaces: " + charCountWithoutSpaces);

        // Example 2: Replace all 'a' characters with 'A' in a string.
        String example2 = "Java programming is amazing.";
        String replacedA = example2.replace('a', 'A');
        System.out.println("String after replacing 'a' with 'A': " + replacedA);

        // Example 3: Replace all occurrences of the word "kara" with "*".
        String example3 = "Kara kara düşünürken kar yağdı.";
        String replacedKara = example3.replace("kara", "*");
        System.out.println("String after replacing 'kara' with '*': " + replacedKara);

        // Example 4: Replace all digits in a string with '*'.
        String example4 = "AC202117004";
        String replacedDigits = example4.replaceAll("\\d", "*");
        System.out.println("String after replacing digits with '*': " + replacedDigits);
    }
}
