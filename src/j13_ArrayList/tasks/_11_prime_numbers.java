package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
        Enter a non-negative number n, and print the count of prime numbers up to this number.

        Example 1:
        Input: n = 20
        Output: 8
        Explanation: There are 8 prime numbers less than or equal to 20: (2, 3, 5, 7, 11, 13, 17, 19)

        Example 2:
        Input: n = 10
        Output: 4
        Explanation: There are 4 prime numbers less than or equal to 10: (2, 3, 5, 7)
     */

    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // Optimized with Math.sqrt(i)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }

        System.out.println("Prime numbers up to " + n + ": " + primeList);
        System.out.println("Count of prime numbers: " + primeList.size());

        scanner.close();
    }
}
