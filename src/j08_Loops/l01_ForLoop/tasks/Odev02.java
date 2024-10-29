package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Odev02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 100 (0 and 100 included): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 100) {
            System.out.println("Please enter a valid number between 0 and 100.");
        } else {
            System.out.println("Numbers between 0 and " + number + " divisible by both 4 and 5:");

            for (int i = 0; i <= number; i++) {
                if (i % 4 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
