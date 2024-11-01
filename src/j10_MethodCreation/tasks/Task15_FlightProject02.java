package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task15_FlightProject02 {
    static Scanner scan = new Scanner(System.in);
    static double fare;
    static double ageFactor;
    static double directionFactor;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Total Fare: $" + (selectCity() * calculateAgeFactor() * calculateDirectionFactor()));
    }

    // Method to select the city and set the base fare based on distance
    public static double selectCity() {
        System.out.print("Please select your destination city: B / C / D --> ");
        char city = scan.next().toUpperCase().trim().charAt(0);

        switch (city) {
            case 'B':
                fare = 500 * 0.1;
                break;
            case 'C':
                fare = 700 * 0.1;
                break;
            case 'D':
                fare = 900 * 0.1;
                break;
            default:
                System.out.println("Invalid selection, please try again.");
                selectCity();
        }
        return fare;
    }

    // Method to calculate the age factor for fare adjustment
    public static double calculateAgeFactor() {
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        if (age > 0) {
            if (age < 12) {
                ageFactor = 0.5;
            } else if (age < 24) {
                ageFactor = 0.9;
            } else if (age > 65) {
                ageFactor = 0.7;
            } else {
                ageFactor = 1;
            }
        } else {
            System.out.println("Age cannot be less than 0. Please enter a valid age.");
            calculateAgeFactor();
        }
        return ageFactor;
    }

    // Method to calculate the direction factor based on one-way or round-trip selection
    public static double calculateDirectionFactor() {
        System.out.print("Enter -1- for Round Trip, -2- for One-Way: ");
        int direction = scan.nextInt();

        switch (direction) {
            case 2:
                directionFactor = 1;
                break;
            case 1:
                directionFactor = 2 * 0.8;
                break;
            default:
                System.out.println("Invalid selection, please try again.");
                calculateDirectionFactor();
                break;
        }
        return directionFactor;
    }
}
