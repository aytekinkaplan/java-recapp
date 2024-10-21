package j04_JavaOperators.ch01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamiTask {
    public static void main(String[] args) {

        // Task: Create a code that prints the sum of the digits of a 3-digit number
        // Example:
        // Input: 111
        // Output: 3

        // Step 1: Create a Scanner object to capture user input
        Scanner input = new Scanner(System.in);

        // Step 2: Ask the user for a 3-digit number
        System.out.println("Please enter a 3-digit number: ");

        // Step 3: Capture the user's input as an integer
        int sayi = input.nextInt();  // Assign the user input to the variable `sayi`

        // Check if the number is actually a 3-digit number
        if (sayi >= 100 && sayi <= 999) {

            // Step 4: Extract each digit
            int birlerBasamagi = sayi % 10;  // Extract the unit place (one's place)
            sayi /= 10;  // Remove the last digit (now the number is two digits)

            int onlarBasamagi = sayi % 10;  // Extract the ten places
            int yuzlerBasamagi = sayi / 10;  // The remaining number is the hundred places

            // Step 5: Calculate the sum of the digits
            int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;

            // Step 6: Print the result
            System.out.println("The sum of the digits is: " + toplam);  // Example output: 3

        } else {
            // Handle cases where the user doesn't enter a 3-digit number
            System.out.println("Please enter a valid 3-digit number.");
        }

        // Close the scanner
        input.close();
    }
}
