package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task15_FlightProject03 {
    static Scanner scan = new Scanner(System.in);
    static double priceB = 500 * 0.1;
    static double priceC = 700 * 0.1;
    static double priceD = 900 * 0.1;

    public static void main(String[] args) {
        travel();
    }

    public static void travel() {
        System.out.print("Which city would you like to travel to? (B, C, D): ");
        String city = scan.next().toUpperCase().trim();
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.print("Would you like to purchase a round-trip ticket? (Y for Yes, N for No): ");
        char roundTrip = scan.next().toUpperCase().trim().charAt(0);

        switch (city) {
            case "B":
                applyAgeDiscount(age);
                applyFlightDiscount(roundTrip);
                calculateTotalBill(applyAgeDiscount(age), applyFlightDiscount(roundTrip), priceB);
                break;
            case "C":
                applyAgeDiscount(age);
                applyFlightDiscount(roundTrip);
                calculateTotalBill(applyAgeDiscount(age), applyFlightDiscount(roundTrip), priceC);
                break;
            case "D":
                applyAgeDiscount(age);
                applyFlightDiscount(roundTrip);
                calculateTotalBill(applyAgeDiscount(age), applyFlightDiscount(roundTrip), priceD);
                break;
            default:
                System.out.println("Invalid input, please try again.");
        }
    }

    public static double applyAgeDiscount(int age) {
        double ageDiscount = 1.0;
        if (age >= 65) {
            ageDiscount = 0.7;
        } else if (age >= 0 && age < 12) {
            ageDiscount = 0.5;
        } else if (age >= 12 && age < 24) {
            ageDiscount = 0.9;
        } else if (age < 0) {
            System.out.println("Invalid age: " + age);
            travel();
        }
        return ageDiscount;
    }

    public static double applyFlightDiscount(char roundTrip) {
        double flightTypeDiscount = 1.0;
        switch (roundTrip) {
            case 'Y':
                flightTypeDiscount = 0.8 * 2;
                break;
            case 'N':
                break;
            default:
                System.out.println("Invalid input, please try again.");
                travel();
                break;
        }
        return flightTypeDiscount;
    }

    public static void calculateTotalBill(double ageDiscount, double flightDiscount, double price) {
        double total = ageDiscount * flightDiscount * price;
        System.out.println("Ticket Price: $" + total);
    }
}
