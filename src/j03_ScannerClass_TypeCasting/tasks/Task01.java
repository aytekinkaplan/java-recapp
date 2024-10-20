package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK ->
		 Ask the user to enter mid-term grade, final grade, and project grade.
		 Calculate the overall grade based on the following percentages:
		 - Mid-term: 30%
		 - Project: 20%
		 - Final: 50%

		  Example:
		      INPUT: mid-term grade = 78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is: 81.6"
		 */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input the mid-term grade
        System.out.println("Enter mid-term grade: ");
        double midTermGrade = scanner.nextDouble();

        // Step 3: Ask the user to input the final exam grade
        System.out.println("Enter final grade: ");
        double finalGrade = scanner.nextDouble();

        // Step 4: Ask the user to input the project grade
        System.out.println("Enter project grade: ");
        double projectGrade = scanner.nextDouble();

        // Step 5: Calculate the overall grade based on the formula
        double generalGrade = (midTermGrade * 0.3) + (projectGrade * 0.2) + (finalGrade * 0.5);

        // Step 6: Determine and print the letter grade based on the calculated grade
        if (generalGrade >= 90) {
            System.out.println("Your grade is: " + generalGrade + ", A");
        } else if (generalGrade >= 80) {
            System.out.println("Your grade is: " + generalGrade + ", B");
        } else if (generalGrade >= 70) {
            System.out.println("Your grade is: " + generalGrade + ", C");
        } else if (generalGrade >= 60) {
            System.out.println("Your grade is: " + generalGrade + ", D");
        } else {
            System.out.println("Your grade is: " + generalGrade + ", F");
        }

        // Step 7: Close the scanner to prevent memory leaks
        scanner.close();
    }
}
