package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {

    public static void main(String[] args) {

        // TASK: Check if the entered age is greater than 18.
        // If it is less than 18, print that the user cannot obtain a driver's license.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to get a driver's license.");
        } else {
            System.out.println("You are not eligible to get a driver's license.");
        }

        input.close();
    }
}