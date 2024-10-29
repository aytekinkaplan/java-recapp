package j08_Loops.l01_ForLoop.tasks;

public class Odev03 {

    public static void main(String[] args) {
        // Calculate the sum of the first 10 natural numbers (1 to 10)

        int sum = 0;  // Variable to store the cumulative sum

        for (int i = 1; i <= 10; i++) {  // Loop through numbers 1 to 10
            sum += i;  // Add the current number to the cumulative sum
        }

        // Print the result
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
