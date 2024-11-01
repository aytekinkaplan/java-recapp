package j10_MethodCreation.tasks;

public class Odev01Medium {

    /*
    Method named randomNum generates a random number between 0 and a specified maximum value.
    - Takes an integer parameter `max`.
    - Prints a random integer between 0 and max (exclusive).
    */

    // Method to generate a random integer between 0 and max
    public static void randomNum(int max) {
        System.out.println((int) (Math.random() * max));
    }

    public static void main(String[] args) {
        int max = 10; // Define the maximum range for the random number
        randomNum(max); // Call the randomNum method with max as the argument
    }
}
