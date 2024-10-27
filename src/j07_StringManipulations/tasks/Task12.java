package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK:
        Prompt the user for a name consisting of three words and print the initials in the format:
        Example: Ali Mert Yılmaz -> A.M.Y.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name with three words: ");

        String name = scanner.nextLine();
        String[] nameParts = name.trim().split(" ");

        // Check if exactly three words were entered
        if (nameParts.length == 3) {
            System.out.println(nameParts[0].toUpperCase().charAt(0) + "." +
                    nameParts[1].toUpperCase().charAt(0) + "." +
                    nameParts[2].toUpperCase().charAt(0) + ".");
        } else {
            System.out.println("Please enter exactly three words.");
        }
    }
}
