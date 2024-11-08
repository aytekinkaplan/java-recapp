package j17_PassByValue;

public class C02_PassByValue_Reference {
    public static void main(String[] args) {
        // Task: Create methods that calculate and print the price after 11%, 22%, and 33% discounts.

        double price = 100;

        System.out.println("Price before method calls: " + price); // 100

        System.out.println("Price after 11% discount = " + discount11(price)); // Expected: 89.0
        System.out.println("Price after 22% discount = " + discount22(price)); // Expected: 78.0
        System.out.println("Price after 33% discount = " + discount33(price)); // Expected: 67.0

        System.out.println("Price after method calls: " + price); // Expected: 100
    }

    // Method to apply a 33% discount
    private static double discount33(double price) {
        return price * 0.67;
    }

    // Method to apply a 22% discount
    private static double discount22(double price) {
        return price * 0.78;
    }

    // Method to apply an 11% discount
    private static double discount11(double price) {
        return price * 0.89;
    }
}
