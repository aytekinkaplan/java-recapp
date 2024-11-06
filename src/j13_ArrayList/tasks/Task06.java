package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /* TASK:
           Take a 6-element array from the user, filter out only the odd elements,
           and store them in a separate array. Print the new array in a method.
         */

        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[6];

        // Getting 6 elements from the user
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Call the method to get odd numbers and print them
        int[] oddNumbersArray = getOddNumbers(inputArray);
        System.out.println("Array of odd numbers:");
        for (int num : oddNumbersArray) {
            System.out.print(num + " ");
        }
    }

    // Method to filter odd numbers and return them in a new array
    public static int[] getOddNumbers(int[] array) {
        List<Integer> oddNumbersList = new ArrayList<>();

        // Filter odd numbers and add them to the list
        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbersList.add(num);
            }
        }

        // Convert the list to an array
        int[] oddNumbersArray = new int[oddNumbersList.size()];
        for (int i = 0; i < oddNumbersList.size(); i++) {
            oddNumbersArray[i] = oddNumbersList.get(i);
        }

        return oddNumbersArray;
    }
}
