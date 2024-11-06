package j13_ArrayList.tasks;

import java.util.Scanner;

public class Task12_Manav {

    public static void main(String[] args) {
        /* TASK:
         * Write a simple grocery shopping program with 5 products.
         *
         * Step 1: Allow the user to select a product from the product list and ask how many kilograms they want.
         * Step 2: Ask if they want to buy another product.
         *         If they don't, display the total amount; if they do, let them select another product.
         *         Repeat this until they choose to end their shopping.
         * Step 3: Each time a product is selected, add its price to the total.
         * Step 4: At the end of the shopping, display the total amount to be paid.
         *
         */

        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        boolean continueShopping = true;

        System.out.println("Welcome to the grocery store!");
        System.out.println("Available products and prices (per kg): ");
        System.out.println("1. Apple - 2.50 TL");
        System.out.println("2. Pear - 3.50 TL");
        System.out.println("3. Watermelon - 4.50 TL");
        System.out.println("4. Tomato - 1.50 TL");
        System.out.println("5. Banana - 5.50 TL");

        while (continueShopping) {
            System.out.print("Enter the product number you want to buy: ");
            int product = scanner.nextInt();
            System.out.print("How many kilograms? ");
            int kg = scanner.nextInt();

            switch (product) {
                case 1:
                    totalCost += calculateCost(kg, 2.50);
                    break;
                case 2:
                    totalCost += calculateCost(kg, 3.50);
                    break;
                case 3:
                    totalCost += calculateCost(kg, 4.50);
                    break;
                case 4:
                    totalCost += calculateCost(kg, 1.50);
                    break;
                case 5:
                    totalCost += calculateCost(kg, 5.50);
                    break;
                default:
                    System.out.println("Invalid product selection.");
                    continue;
            }

            System.out.print("Do you want to buy another product? (yes/no): ");
            String response = scanner.next();
            continueShopping = response.equalsIgnoreCase("yes");
        }

        System.out.printf("Total amount to be paid: %.2f TL%n", totalCost);
        scanner.close();
    }

    // Method to calculate cost of a specific product
    private static double calculateCost(int kg, double pricePerKg) {
        double cost = kg * pricePerKg;
        System.out.printf("Cost for %d kg: %.2f TL%n", kg, cost);
        return cost;
    }
}
