package j10_MethodCreation.tasks;

public class Task11 {

    public static void main(String[] args) {
        /*
        Task: Write a method named `toHackerLanguage` that converts a user's text into "hacker language" and returns it.

        Hackers typically replace certain letters with numbers as follows:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        Test data:
        toHackerLanguage("I love Java")
        Expected output: "1 l0v3 J4v4"
        */

        String text = "I love Java";
        System.out.println("Original text: " + text);
        System.out.println("Hacker language: " + toHackerLanguage(text));
    }

    // Method to convert text to "hacker language"
    public static String toHackerLanguage(String text) {
        text = text.replace('s', '5');
        text = text.replace('a', '4');
        text = text.replace('e', '3');
        text = text.replace('i', '1');
        text = text.replace('o', '0');
        return text;
    }
}
