package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
         Task:
         Create a program that checks if a given year is a leap year.
         Leap Year Rules:
         - Rule 1: Years not divisible by 4 are not leap years.
         - Rule 2: Years divisible by 4 but not by 100 are leap years.
         - Rule 3: Years divisible by 100 but also by 400 are leap years.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking if the year is a leap year based on given rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

        // Closing the Scanner to free up resources
        input.close();
    }
}
