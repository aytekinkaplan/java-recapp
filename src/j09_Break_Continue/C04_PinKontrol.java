package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {

    public static void main(String[] args) {
        // Task: Create a code to verify a PIN, with a maximum of 3 attempts.

        Scanner input = new Scanner(System.in);
        String correctPin = "12345.abs";  // Stored correct PIN
        int attemptsLeft = 3;             // Number of allowed attempts

        while (true) {
            System.out.println("Enter PIN code:");
            String enteredPin = input.nextLine();

            // Check if entered PIN matches the correct PIN
            if (correctPin.equals(enteredPin)) {
                System.out.println("PIN matched. Access granted.");
                break;
            } else {
                // Decrement attempts and notify the user
                attemptsLeft--;
                System.out.println("Incorrect PIN. Please try again.");
                System.out.println("Remaining attempts: " + attemptsLeft);

                // If no attempts are left, block access and exit
                if (attemptsLeft == 0) {
                    System.out.println("Access blocked. You have no attempts left.");
                    break;
                }
            }
        }

        // Close the scanner to free up resources
        input.close();
    }
}
