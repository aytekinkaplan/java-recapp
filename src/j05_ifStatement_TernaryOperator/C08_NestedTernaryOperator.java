package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
         TASK:
         Prompt the user to enter the quantity of the product and the unit price.
         - If the quantity is more than 100, apply a 33% discount and print the total amount due.
         - Otherwise, calculate the total without any discount.
        */

        Scanner input = new Scanner(System.in);

        // Getting user input for product quantity and unit price
        System.out.print("Enter the quantity of the product: ");
        int productQuantity = input.nextInt();

        System.out.print("Enter the unit price of the product: ");
        double unitPrice = input.nextDouble();

        // Calculating the invoice amount with a discount if applicable
        double totalAmount = productQuantity > 100
                ? productQuantity * unitPrice * 0.67
                : productQuantity * unitPrice;

        // Displaying the final amount
        System.out.printf("Total Amount Due: $%.2f%n", totalAmount);

        // Closing the Scanner to free up resources
        input.close();
    }
}
