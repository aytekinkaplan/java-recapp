package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    // Method to convert hours to seconds
    public static void convert(int hours) {
        int seconds = hours * 3600;
        System.out.println(hours + " hour(s) = " + seconds + " seconds");
    }

    public static void main(String[] args) {
        /*
        Task: Create a method that converts hours to seconds.

        Test Data:
        convert(2);

        Expected output:
        7200
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        // Call the convert method
        convert(hours);

        scanner.close();
    }
}
