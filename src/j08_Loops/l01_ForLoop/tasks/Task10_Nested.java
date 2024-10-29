public class Task10_Nested {

    public static void main(String[] args) {
        /*
        The task is to print the following pattern:

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        */

        int harf = 65;  // ASCII value of 'A' is 65

        // Outer loop for rows
        for (int i = 0; i < 6; i++) {

            // Inner loop for printing characters in each row
            for (int j = 0; j <= i; j++) {
                // Print the character corresponding to (harf + i)
                System.out.print((char) (harf + i) + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
