package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // TASK: Create code that checks if a specified number exists in a user-defined list.

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list and populate it with user input
        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.print("Enter the number of elements in the list: ");
        int listSize = scanner.nextInt();

        System.out.println("Enter the numbers in the list:");
        for (int i = 0; i < listSize; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbersList.add(number);
        }

        // Step 2: Ask for the number to check
        System.out.print("Enter a number you want to check in the list: ");
        int numberToCheck = scanner.nextInt();

        // Step 3: Check if the number is in the list
        if (numbersList.contains(numberToCheck)) {
            System.out.println("The number " + numberToCheck + " is in the list.");
        } else {
            System.out.println("The number " + numberToCheck + " is not in the list.");
        }

        scanner.close();
    }
}
