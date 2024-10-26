package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK: Print the tens place digit of an entered number as a word.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the ten digits by dividing the number by 10 and then getting the remainder when divided by 10
        int tensDigit = (number / 10) % 10;

        // Convert the ten digits to a string to use in the switch statement
        String tensDigitString = String.valueOf(tensDigit);

        // Print the word equivalent of the ten digits
        switch (tensDigitString) {
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            case "4":
                System.out.println("Four");
                break;
            case "5":
                System.out.println("Five");
                break;
            case "6":
                System.out.println("Six");
                break;
            case "7":
                System.out.println("Seven");
                break;
            case "8":
                System.out.println("Eight");
                break;
            case "9":
                System.out.println("Nine");
                break;
            case "0":
                System.out.println("Zero");
                break;
            default:
                System.out.println("Invalid number");
        }

        scanner.close();
    }
}
