package j04_JavaOperators.tasks;

public class Task09 {

    /*
     * Calculate the total number of animal legs on the farm.
     * Let's calculate the total number of legs for cows, sheep, and chickens.
     * 
     * Cows have 4 legs, sheep have 4 legs, and chickens have 2 legs.
     */

    public static void main(String[] args) {
        // Define the number of animals
        int cows = 5;    // Number of cows
        int sheep = 10;  // Number of sheep
        int chickens = 20;  // Number of chickens

        // Calculate the total number of legs
        int cowLegs = cows * 4;  // Each cow has 4 legs
        int sheepLegs = sheep * 4;  // Each sheep has 4 legs
        int chickenLegs = chickens * 2;  // Each chicken has 2 legs

        // Calculate the total legs
        int totalLegs = cowLegs + sheepLegs + chickenLegs;

        // Print the result
        System.out.println("The total number of animal legs on the farm is: " + totalLegs);
    }
}
