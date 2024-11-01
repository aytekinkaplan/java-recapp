package j12_Arrays;

public class C07_MDArrays {
    public static void main(String[] args) {

        // Task: Create code to sum all elements in aprMD. Expected total = 142
        int[][] aprMD = {
                {       1, // Apartment 0
                        2, // Apartment 1
                        3  // Apartment 2
                }, // Floor 0

                {10, 23}, // Floor 1

                {103}    // Floor 2
        };

        int total = 0;

        for (int floor = 0; floor < aprMD.length; floor++) { // aprMD has length 3

            for (int apartment = 0; apartment < aprMD[floor].length; apartment++) {

                total += aprMD[floor][apartment]; // Access each apartment on each floor and add to total

            }
            System.out.println("Total after inner loop = " + total);

        }

        System.out.println("Final total = " + total); // Final total = 142

    }
}
