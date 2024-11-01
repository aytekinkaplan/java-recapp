package j10_MethodCreation.tasks;

public class Odev03 {

    /* Method to check if a given number is prime
     * getAsalMi(int sayi) returns true if the number is prime, otherwise false.
     */

    public static void main(String[] args) {
        int sayi = 13;
        System.out.println(getAsalMi(sayi)); // Prints true if `sayi` is prime, false otherwise
    }

    private static boolean getAsalMi(int sayi) {
        if (sayi <= 1) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) { // Only loop up to the square root of the number
            if (sayi % i == 0) {
                return false; // If `sayi` is divisible by `i`, it's not prime
            }
        }
        return true; // If no divisors are found, `sayi` is prime
    }
}
