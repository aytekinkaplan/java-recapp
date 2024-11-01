package j11_Debugger;

// Defines the package `j11_Debugger` to organize related classes.

import java.util.Scanner;
import static j10_MethodCreation.C05_CRUD.cikis;

// Imports Scanner for user input and an `exit` method (cikis) from another package.

public class C02_Debugger {
    // Declares the `C02_Debugger` class, containing methods for ATM operations.

    // TODO: Move methods in this class to separate classes for better organization.

    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 2; // Counter for incorrect password attempts.

    public static void main(String[] args) throws InterruptedException {
        // The `main` method starts the program and calls the `sifreKontrol()` method.
        sifreKontrol();
    }

    private static void sifreKontrol() throws InterruptedException {
        System.out.println(" ************************** ");
        System.out.println(" ***** Welcome to our bank *****");
        System.out.println("Please enter your password");

        String sifre = input.nextLine();

        while (count > 0) {
            if (sifre.equals(password)) {
                System.out.println("*");
                Thread.sleep(2000);
                System.out.println("**");
                Thread.sleep(2000);
                System.out.println("***");
                Thread.sleep(2000);
                System.out.println("Password verification successful");
                anaMenu(); // Directs to main menu if password is correct.
                break;
            } else {
                System.out.println("Password incorrect, try again");
                sifre = input.nextLine();
                count--;
                if (count == 0) {
                    System.out.println("Card blocked");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {
        System.out.println("To check balance, press 1\nTo deposit money, press 2\nTo withdraw money, press 3\nTo exit, press 4");

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
                System.out.println("Invalid selection, please try again");
                anaMenu();
                break;
        }
    }

    private static void paraCekme() {
        System.out.println("Current balance = " + bakiye);
        System.out.println("How much would you like to withdraw?");
        double cekMiktar = input.nextDouble();

        if (cekMiktar > bakiye) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount: " + cekMiktar);
            System.out.println("Do you confirm this amount?");
            // TODO: Add confirmation input from user, continue if confirmed, return to menu otherwise.

            bakiye -= cekMiktar;
            System.out.println("After withdrawal, your new balance = " + bakiye);
        }
    }

    private static void paraYatir() {
        System.out.println("Current balance = " + bakiye);
        System.out.println("How much would you like to deposit?");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("After deposit, your new balance = " + bakiye);
    }

    private static void bakiyeSorgula() {
        System.out.println("Your current balance = " + bakiye);
    }

} // End of class
