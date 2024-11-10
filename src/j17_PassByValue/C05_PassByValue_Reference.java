package j17_PassByValue;

public class C05_PassByValue_Reference {

    public static void main(String[] args) {
        /*
        If you want changes made within a method to be permanent,
        you can reassign the variable to the value returned by the method.
         */

        double priceTag = 100;
        double discountRate = 0.1;
        System.out.println("Price before discount: " + priceTag); // Expected: 100.0

        // Reassign priceTag to the discounted value returned by the method
        priceTag = applyDiscount(priceTag, discountRate); // Inside method: Price = 90.0

        System.out.println("Price after discount: " + priceTag);  // Expected: 90.0
    }

    // Method to apply a discount and return the updated price
    private static double applyDiscount(double priceTag, double discountRate) {
        priceTag *= (1 - discountRate);
        System.out.println("Price from within the method: " + priceTag);
        return priceTag; // Return the discounted price
    }
}
