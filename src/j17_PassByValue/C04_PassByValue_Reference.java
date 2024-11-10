package j17_PassByValue;

public class C04_PassByValue_Reference {
    // Static variables, meaning they retain their values across method calls
    static double priceTag;
    static double discountRate;

    public static void main(String[] args) {
        /*
        If you want changes made within a method to be permanent (i.e., affect the original values),
        you can use static variables. Static variables belong to the class rather than to individual instances,
        so changes to them persist across method calls.
         */

        priceTag = 100; // Initial price
        System.out.println("Price before method calls: " + priceTag); // Expected: 100

        discountRate = 0.1; // 10% discount rate

        applyDiscount();  // First call: price becomes 90.0
        applyDiscount();  // Second call: price becomes 81.0
        applyDiscount();  // Third call: price becomes 72.9

        System.out.println("Price after method calls: " + priceTag); // Expected: 72.9
    }

    // Method to apply a discount to the price tag
    private static void applyDiscount() {
        priceTag *= (1 - discountRate); // Apply discount to price
        System.out.println("Price from within the method: " + priceTag);
    }
}
