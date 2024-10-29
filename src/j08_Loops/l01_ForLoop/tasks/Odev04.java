package j08_Loops.l01_ForLoop.tasks;

public class Odev04 {

    public static void main(String[] args) {
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        // Total rows in the pattern
        int rows = 5;

        // Outer loop to control the number of rows
        for (int i = 1; i <= rows; i++) {
            // Initialize the starting number for each row
            int number = i;

            // Inner loop to control the elements within each row
            for (int j = 1; j <= i; j++) {
                // Print the current number followed by a space
                System.out.print(number + " ");

                // Increment the number based on the pattern rule
                // The increment is (rows - j) to create the stepped pattern
                number += (rows - j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
