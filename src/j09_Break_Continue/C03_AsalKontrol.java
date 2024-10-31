package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        // Task: Create code to check if an entered integer is a prime number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");

        int sayi = input.nextInt();
        boolean asalMi = true;

        // Loop to check if the number has any divisors other than 1 and itself
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) { // Check if the number is divisible by any integer
                System.out.println(sayi + " is not a prime number.");
                asalMi = false;
                break; // Exit the loop since we found a divisor
            }
        }

        // After the loop, determine if the number is prime
        if (asalMi && sayi != 1) {
            System.out.println(sayi + " is a prime number.");
        } else {
            System.out.println("Not a prime number.");
        }

        input.close();
    }
}
