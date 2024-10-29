package j08_Loops.l01_ForLoop.tasks;

public class Task02_Nested {
    public static void main(String[] args) {
        // Define the number of rows and columns
        int rows = 6;
        int columns = 5;

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for columns
            for (int j = 0; j < columns; j++) {
                System.out.print("# ");  // Print # symbol followed by a space
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
