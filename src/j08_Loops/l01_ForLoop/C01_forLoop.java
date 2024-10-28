package j08_Loops.l01_ForLoop;

public class C01_forLoop {
    public static void main(String[] args) {

        /*
         * Task:
         * - Print "java is good" 33 times.
         * - Demonstrate the use of a for loop for repetitive actions.
         */

        // Solution using a loop
        for (int i = 0; i < 33; i++) {
            System.out.println((i + 1) + ": java is good");
        }

        /*
         * Explanation of the Loop Structure:
         * - The loop is structured as follows:
         *   for (initialization; condition; increment) { ... }
         * - Initialization: int i = 0; -> Initializes the loop variable i to 0.
         * - Condition: i < 33; -> Loop continues as long as this condition is true.
         * - Increment: i++ -> Increments i by 1 after each iteration.
         */

        // Task: Print all two-digit odd numbers side by side (e.g., 11, 13, 15,...99)

        System.out.println("Two-digit odd numbers:");
        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n*************");

        // Alternative solution using a conditional check for odd numbers
        for (int j = 10; j < 100; j++) {
            if (j % 2 == 1) { // Checks if the number is odd
                System.out.print(j + " ");
            }
        }

        /*
         * Explanation:
         * - First approach: Incrementing i by 2 (i += 2) ensures that only odd numbers are printed.
         * - Second approach: Checks if each number j is odd by verifying if j % 2 == 1.
         */

        // Example of a loop that does not execute
        for (int i = 1; i > 10; i++) {
            System.out.println("This loop will not execute because the condition is false initially.");
        }

        /*
         * Explanation:
         * - The condition i > 10 is false at the start, so the loop never runs.
         */

        // Infinite loop example (commented out to avoid execution)
        /*
        for (int i = 0; i >= 0; i++) {
            System.out.println("Infinite loop example"); // This will run indefinitely
        }
        */

        /*
         * Explanation:
         * - This loop creates an infinite loop because the condition i >= 0 is always true.
         * - To prevent issues, infinite loops should be avoided or carefully controlled.
         */
    }
}
