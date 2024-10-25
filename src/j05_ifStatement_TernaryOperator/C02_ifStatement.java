package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C01_ifStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting ages from the user
        System.out.print("Enter Meryem's age: ");
        int ageOfMeryem = input.nextInt();

        System.out.print("Enter Ahmet's age: ");
        int ageOfAhmet = input.nextInt();

        // Calling methods to compare ages
        checkSameAge(ageOfMeryem, ageOfAhmet);
        checkIfOlderThan(ageOfMeryem, 40, "Meryem");
        checkTotalAge(ageOfMeryem, ageOfAhmet, 60);

        input.close();
    }

    // Method to check if two people are the same age
    public static void checkSameAge(int age1, int age2) {
        if (age1 == age2) {
            System.out.println("Both persons are the same age.");
        } else {
            System.out.println("They are not the same age.");
        }
    }

    // Method to check if a person is older than a certain age
    public static void checkIfOlderThan(int age, int comparisonAge, String name) {
        if (age > comparisonAge) {
            System.out.println(name + " is older than " + comparisonAge + ".");
        } else {
            System.out.println(name + " is not older than " + comparisonAge + ".");
        }
    }

    // Method to check if the combined age of two people exceeds a threshold
    public static void checkTotalAge(int age1, int age2, int threshold) {
        if (age1 + age2 > threshold) {
            System.out.println("Their combined age is greater than " + threshold + ".");
        } else {
            System.out.println("Their combined age is not greater than " + threshold + ".");
        }
    }
}
