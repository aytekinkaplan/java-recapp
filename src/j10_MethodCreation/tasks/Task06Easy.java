package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task06Easy {

    /*
    Create a method named powerOfThree.
        Parameter: int
        Return type: boolean
        Check if a given integer is a power of 3.
        If it is a power of 3, return true; otherwise, return false.

        Example 1:
        Input: 27
        Output: true
        Explanation: 3*3*3 = 27
        Result = true

        Example 2:
        Input: 0
        Output: false

        Example 3:
        Input: 9
        Output: true
        Explanation: 3*3 = 9
        Result = true

        Example 4:
        Input: 45
        Output: false
        Explanation: 3*3*3*3 = 81
        Result = false
        45 is not a power of 3.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println("Is the number a power of 3? " + powerOfThree(num));
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        input.close();
    }

    public static boolean powerOfThree(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}
