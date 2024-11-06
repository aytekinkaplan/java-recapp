package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // TASK: Create a method that prints numbers greater than the average of the entered numbers.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Loop to take input from user until they enter 0
        System.out.println("Enter numbers (enter 0 to finish): ");
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Exit loop if the input is 0
            }
            numbers.add(number);
        }

        // Call the method to calculate and print numbers above average
        averageAboveCalculator(numbers);

        scanner.close();
    }

    private static void averageAboveCalculator(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        // Calculate the sum and average
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size(); // Using double for precise average
        System.out.println("Average: " + average);

        // Print numbers above the average
        System.out.println("Numbers above average:");
        for (Integer number : numbers) {
            if (number > average) {
                System.out.println(number);
            }
        }
    }
}
