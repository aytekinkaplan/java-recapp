package j08_Loops.l01_ForLoop;

public class C03_nested_forLoop {
    public static void main(String[] args) {

        /*
         * Nested Loops:
         * - A loop within another loop is called a nested loop.
         * - In nested loops, the inner loop completes all its iterations for each iteration of the outer loop.
         * - The innermost loop executes first within the nested structure.
         */

        // Task: Simulate an apartment building with floors and apartments using nested loops.
        //       - There are 10 floors (0-10).
        //       - Each floor has 4 apartments (1-4).

        for (int floor = 0; floor <= 10; floor++) { // Outer loop represents floors
            System.out.println("Currently on floor: " + floor);

            for (int apartment = 1; apartment <= 4; apartment++) { // Inner loop represents apartments on each floor
                System.out.println("  Apartment: " + apartment);
            }
        }

        /*
         * Explanation:
         * - The outer loop iterates through each floor from 0 to 10.
         * - For each floor, the inner loop iterates through apartments from 1 to 4.
         * - The inner loop completes all apartment numbers for a given floor before moving to the next floor.
         * - This structure simulates an apartment building with each floor and its apartments.
         */
    }
}
