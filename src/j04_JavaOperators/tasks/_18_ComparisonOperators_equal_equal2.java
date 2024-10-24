package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

        /*
        This task will verify whether two double values are equal using the '==' operator.
        
        Goal:
        - Get two double values (num1 and num2) from the user.
        - Check if they are equal using the '==' operator.
        - Print 'true' if they are equal, and print 'false' otherwise.
        */

        // Create a Scanner object to take input
        Scanner dp = new Scanner(System.in);

        // Prompt the user to enter two double values
        System.out.println("Enter the first double number: ");
        double num1 = dp.nextDouble();

        System.out.println("Enter the second double number: ");
        double num2 = dp.nextDouble();

        // Check if the two double values are equal
        if (num1 == num2) {
            System.out.println(true);  // If they are equal, print true
            System.out.println("The numbers are equal.");
        } else {
            System.out.println(false);  // If they are not equal, print false
            System.out.println("The numbers are not equal.");
        }

        // Close the scanner to prevent resource leak
        dp.close();
    }
}
