package j08_Loops.l01_ForLoop;

public class C05_PatternQuestion {
    public static void main(String[] args) {

        /*
         * Task:
         * - Print the following pattern using nested loops:
         *   A
         *   A B
         *   A B C
         *   A B C D
         *   A B C D E
         *   A B C D E F
         *
         * - Explanation:
         *   - ASCII value of 'A' is 65, so we use this value to generate characters dynamically.
         */

        int asciiValueA = 65; // ASCII value of 'A'

        for (int i = 0; i < 6; i++) { // Outer loop controls the number of rows
            for (int j = 0; j <= i; j++) { // Inner loop prints characters in each row
                System.out.print((char) (asciiValueA + j) + " "); // Convert ASCII to char and print
            }
            System.out.println(); // New line after each row
        }

        /*
         * Explanation:
         * - The outer loop (i) controls the number of rows, which increases up to 6 rows.
         * - The inner loop (j) controls the characters printed in each row.
         * - `(char) (asciiValueA + j)` dynamically converts each ASCII value to the corresponding letter.
         * - After each row, `System.out.println();` is used to move to a new line.
         */
    }
}
