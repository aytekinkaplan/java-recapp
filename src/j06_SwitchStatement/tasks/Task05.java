package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        /*
            TASK:
            Ask the user for their grade and print A, B, C, or D based on the following rules:
            1. 0 (inclusive) to 50 - D
            2. 50 (inclusive) to 60 - C
            3. 60 (inclusive) to 80 - B
            4. Above 80 - A
            If the input is out of range, print "Enter a valid grade."
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        // Determine the range based on the grade
        int range;

        if (grade >= 0 && grade < 50) {
            range = 0;  // Range for 0-49
        } else if (grade >= 50 && grade < 60) {
            range = 1;  // Range for 50-59
        } else if (grade >= 60 && grade < 80) {
            range = 2;  // Range for 60-79
        } else if (grade >= 80 && grade <= 100) {
            range = 3;  // Range for 80-100
        } else {
            range = -1; // Invalid grade range
        }

        // Use switch to determine the letter grade based on the range
        switch (range) {
            case 0:
                System.out.println("D");
                break;
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("A");
                break;
            default:
                System.out.println("Enter a valid grade.");
                break;
        }

        input.close();
    }
}
