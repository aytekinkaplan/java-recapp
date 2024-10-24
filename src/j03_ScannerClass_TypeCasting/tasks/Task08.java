package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Task:
         * Get the user's two midterm exam grades (vize1 and vize2) and final exam grade.
         * Calculate the final grade based on 30% of the average of the midterms and 70% of the final exam.
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Get the midterm and final exam grades from the user
        System.out.println("Please enter your first mid-term grade: ");
        int vize1 = scanner.nextInt();

        System.out.println("Please enter your second mid-term grade: ");
        int vize2 = scanner.nextInt();

        System.out.println("Please enter your final exam grade: ");
        int finalNot = scanner.nextInt();

        // Step 3: Calculate the midterm average
        double vizeOrt = (vize1 + vize2) / 2.0;  // Using 2.0 to ensure the average is a floating-point number

        // Step 4: Calculate the final grade based on 30% of the midterm average and 70% of the final exam grade
        double gecmeNot = (vizeOrt * 0.30) + (finalNot * 0.70);  // Using floating-point calculations for accuracy

        // Step 5: Print the final grade
        System.out.printf("Your final grade is: %.2f%n", gecmeNot);

        // Step 6: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
