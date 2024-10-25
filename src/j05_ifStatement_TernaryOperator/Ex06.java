package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        /*
         TASK:
         - If the user’s gender is FEMALE, check if the age is over 60 and the contribution days are above 6000 for eligibility.
         - If the user’s gender is MALE, check if the age is over 65 and the contribution days are above 7000 for eligibility.
         - If not eligible, display the remaining years and contribution days needed for eligibility.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Select your gender: \n1 - Female\n2 - Male");
        int gender = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your contribution days: ");
        int contribution = input.nextInt();

        // Set eligibility criteria based on gender
        if (gender == 1) {  // Female
            if (age >= 60 && contribution >= 6000) {
                System.out.println("Congratulations! You are eligible for retirement.");
            } else {
                int remainingYears = (age < 60) ? (60 - age) : 0;
                int remainingContribution = (contribution < 6000) ? (6000 - contribution) : 0;
                System.out.println("You are not eligible for retirement.");
                System.out.println("Years remaining: " + remainingYears + ", Contribution days remaining: " + remainingContribution);
            }
        } else if (gender == 2) {  // Male
            if (age >= 65 && contribution >= 7000) {
                System.out.println("Congratulations! You are eligible for retirement.");
            } else {
                int remainingYears = (age < 65) ? (65 - age) : 0;
                int remainingContribution = (contribution < 7000) ? (7000 - contribution) : 0;
                System.out.println("You are not eligible for retirement.");
                System.out.println("Years remaining: " + remainingYears + ", Contribution days remaining: " + remainingContribution);
            }
        } else {
            System.out.println("Invalid gender selection. Please enter 1 for Female or 2 for Male.");
        }

        // Close the Scanner to free up resources
        input.close();
    }
}
