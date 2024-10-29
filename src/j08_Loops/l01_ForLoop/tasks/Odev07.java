package j08_Loops.l01_ForLoop.tasks;

public class Odev07 {

    public static void main(String[] args) {
        int rows = 8;  // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for center alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print the pattern of * and!
            for (int j = 1; j <= i; j++) {
                // Print * at the start and end of each row, and for the last row
                if (j == 1 || i == rows || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}
