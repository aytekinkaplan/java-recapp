package j10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {

    /*
        A simple flight booking application:
        - Routes: B (500 km), C (700 km), D (900 km)
        - Cost per km: 0.10$
        - Discounts:
          - Under 12 years: 50% off
          - 12-24 years: 10% off
          - Over 65 years: 30% off
          - Round-trip ticket: additional 20% off
    */

    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;  // Cost for route B
    static double fiyatC = 700 * 0.1;  // Cost for route C
    static double fiyatD = 900 * 0.1;  // Cost for route D

    public static void main(String[] args) {
        System.out.println("Welcome to JAVA Airlines! \nAvailable routes: B, C, D");
        System.out.println("Enter your desired destination (B, C, or D):");
        String rota = input.next().toUpperCase();

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {
            System.out.println("For one-way, press 1.\nFor round-trip, press 2:");
            int ucusYonu = input.nextInt();

            System.out.println("Enter your age:");
            int yas = input.nextInt();

            calculateFare(rota, ucusYonu, yas);
        } else {
            System.out.println("Invalid route selection.");
        }
    }

    private static void calculateFare(String rota, int ucusYonu, int yas) {
        double fare = 0;

        // Determine the base fare based on the destination
        switch (rota) {
            case "B":
                fare = fiyatB;
                break;
            case "C":
                fare = fiyatC;
                break;
            case "D":
                fare = fiyatD;
                break;
        }

        // Apply age discount
        if (yas < 12) {
            fare *= 0.5;  // 50% discount for children under 12
        } else if (yas >= 12 && yas < 24) {
            fare *= 0.9;  // 10% discount for ages 12-24
        } else if (yas > 65) {
            fare *= 0.7;  // 30% discount for seniors over 65
        }

        // Apply round-trip discount
        if (ucusYonu == 2) {
            fare *= 0.8 * 2;  // 20% discount for round-trip, doubled for both legs
        }

        // Display final fare
        System.out.printf("Your total fare for route %s is: %.2f $\n", rota, fare);
    }
}
