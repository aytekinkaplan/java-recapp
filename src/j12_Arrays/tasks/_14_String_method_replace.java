package j12_Arrays.tasks;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Create this String: "Hello World"
        Replace all occurrences of the letter "o" with "K".
        The result should be:
        HellK WKrld
         */

        String str = "Hello World";
        str = str.replace('o', 'K'); // Replaces all 'o' with 'K'

        System.out.println(str); // Output: HellK WKrld
    }
}
