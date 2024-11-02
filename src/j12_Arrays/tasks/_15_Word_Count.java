package j12_Arrays.tasks;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Create this String: "Removes white space from both ends of a string"
        Print the number of words in the string.
         */

        String str = "Removes white space from both ends of a string";

        // Split the string into words based on spaces
        String[] arr = str.split(" ");

        // Print the number of words
        System.out.println("Word count: " + arr.length);
    }
}
