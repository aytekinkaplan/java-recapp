package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Constants for destinations and pricing
        final int FRANKFURT_DISTANCE = 60; // in KM
        final int COLOGNE_DISTANCE = 80;   // in KM
        final int PRICE_PER_20KM = 5;      // 5 Euro per 20 KM
        double totalCost = 0.0;

        // Step 1: Choose destination
        System.out.println("Where would you like to travel?");
        System.out.println("Frankfurt : 60 KM --- Cologne : 80 KM");
        System.out.println("(Ticket price is 5 Euro per 20 KM)");

        System.out.print("Enter your destination (Frankfurt/Cologne): ");
        String destination = scanner.next().toUpperCase();

        switch (destination) {
            case "FRANKFURT":
                System.out.println("Route = Frankfurt");
                totalCost = (FRANKFURT_DISTANCE / 20) * PRICE_PER_20KM;
                System.out.println("Ticket price for Frankfurt: " + totalCost + " Euro");
                break;

            case "COLOGNE":
                System.out.println("Route = Cologne");
                totalCost = (COLOGNE_DISTANCE / 20) * PRICE_PER_20KM;
                System.out.println("Ticket price for Cologne: " + totalCost + " Euro");
                break;

            default:
                System.out.println("Invalid destination. Please enter Frankfurt or Cologne.");
                scanner.close();
                return;
        }

        // Step 2: Ask for the number of tickets
        System.out.print("How many tickets do you want? (Max 2): ");
        int numTickets = scanner.nextInt();

        if (numTickets == 1) {
            System.out.println("1 ticket selected.");
            // The Total cost remains the same for 1 ticket
        } else if (numTickets == 2) {
            System.out.println("2 tickets selected.");
            totalCost *= 2; // Double the cost for 2 tickets
        } else {
            System.out.println("Invalid number of tickets. Max allowed is 2.");
            scanner.close();
            return;
        }

        // Step 3: Confirm travel details and calculate balance
        System.out.println("Your journey details: " + destination + " - " + numTickets + " ticket(s)");

        // Define initial balance and calculate change
        double balance = 50.0;  // Example balance amount
        System.out.println("Current balance: " + balance + " Euro");

        // Display total cost and calculate the remaining balance
        System.out.println("Total cost: " + totalCost + " Euro");

        double change = balance - totalCost;
        if (change >= 0) {
            System.out.println("Remaining balance: " + change + " Euro");
        } else {
            System.out.println("Insufficient balance. You need " + Math.abs(change) + " Euro more.");
        }

        scanner.close();
    }
}
