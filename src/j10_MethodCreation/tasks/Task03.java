package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

    // Method to convert time, distance, and weight units
    public static void convert(int time, int distance, int weight) {
        System.out.println("Time in seconds: " + time * 3600);
        System.out.println("Distance in kilometers: " + distance * 1.609);
        System.out.println("Weight in grams: " + weight * 1000);
    }

    public static void main(String[] args) {
        // Task: Write a method that converts hours to seconds, miles to kilometers, and kilograms to grams.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in hours: ");
        int time = scanner.nextInt();
        System.out.print("Enter the distance in miles: ");
        int distance = scanner.nextInt();
        System.out.print("Enter the weight in kilograms: ");
        int weight = scanner.nextInt();

        // Perform the conversions
        convert(time, distance, weight);
        scanner.close();
    }
}
