package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
       Generate the Fibonacci sequence up to an integer entered by the user.
       Example sequence: 1-1-2-3-5-8-13-21-34...
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to generate the Fibonacci sequence up to that number: ");
        int limit = scanner.nextInt();

        // Generate and print the Fibonacci sequence up to the specified limit
        List<Integer> fibonacciSequence = generateFibonacci(limit);
        System.out.println("Fibonacci sequence up to " + limit + ": " + fibonacciSequence);

        scanner.close();
    }

    public static List<Integer> generateFibonacci(int limit) {
        List<Integer> fibonacciList = new ArrayList<>();

        // Initializing the first two Fibonacci numbers
        int a = 1, b = 1;
        fibonacciList.add(a);

        // Add Fibonacci numbers to the list until the limit is reached
        while (b <= limit) {
            fibonacciList.add(b);
            int next = a + b; // Calculate the next Fibonacci number
            a = b;            // Update the first number
            b = next;         // Update the second number
        }

        return fibonacciList;
    }
}
