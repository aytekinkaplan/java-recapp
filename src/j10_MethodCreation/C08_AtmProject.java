package j10_MethodCreation;

import java.util.Scanner;
import static j10_MethodCreation.C05_CRUD.cikis;

public class C08_AtmProject {

    // Class-level variables for user information
    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 2; // Allows for 3 password attempts

    public static void main(String[] args) throws InterruptedException {
        // Entry point for the ATM program
        sifreKontrol();
    }

    private static void sifreKontrol() throws InterruptedException {
        System.out.println("**************************");
        System.out.println("***** Welcome to Our Bank *****");
        System.out.println("Please enter your password:");

        String sifre = input.nextLine();

        while (count > 0) {
            if (sifre.equals(password)) {
                // Password validation success message
                loadingAnimation();
                System.out.println("Password verified successfully");
                anaMenu();
                break;
            } else {
                System.out.println("Incorrect password. Please try again:");
                sifre = input.nextLine();
                count--;

                if (count == 0) {
                    System.out.println("Your card has been blocked.");
                }
            }
        }
    }

    private static void loadingAnimation() throws InterruptedException {
        System.out.println("*");
        Thread.sleep(1000);
        System.out.println("**");
        Thread.sleep(1000);
        System.out.println("***");
        Thread.sleep(1000);
    }

    private static void anaMenu() {
        System.out.println("Press 1 for Balance Inquiry\nPress 2 to Deposit Money\n" +
                "Press 3 to Withdraw Money\nPress 4 to Exit");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgula();
                anaMenu();
                break;
            case 2:
                paraYatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                anaMenu();
                break;
        }
    }

    private static void bakiyeSorgula() {
        System.out.println("Your current balance is: " + bakiye);
    }

    private static void paraYatir() {
        System.out.println("Your current balance is: " + bakiye);
        System.out.println("Enter the amount to deposit:");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("New balance after deposit: " + bakiye);
    }

    private static void paraCekme() {
        System.out.println("Your current balance is: " + bakiye);
        System.out.println("Enter the amount to withdraw:");
        double cekMiktar = input.nextDouble();

        if (cekMiktar > bakiye) {
            System.out.println("Insufficient funds.");
        } else {
            bakiye -= cekMiktar;
            System.out.println("New balance after withdrawal: " + bakiye);
        }
    }
}
