package j08_Loops.l01_ForLoop.tasks;

public class Task03_Nested {
    public static void main(String[] args) {
        // Full multiplication table up to 10x10
        System.out.println("Full Multiplication Table (1 to 10):\n");

        for (int i = 1; i <= 10; i++) {  // First factor
            for (int j = 1; j <= 10; j++) {  // Second factor
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();  // Add a line break after each row for clarity
        }

        // Multiplication table for 1
        System.out.println("Multiplication Table for 1:\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("1 x " + i + " = " + (1 * i));
        }
    }
}
