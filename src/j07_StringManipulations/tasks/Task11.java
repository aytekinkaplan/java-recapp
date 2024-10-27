package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Prompt the user to enter a name and surname in a single input,
       then separate them and print each on a new line.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name and surname: ");

        String name = scanner.nextLine();
        String[] nameAndSurname = name.split(" ");

        // Check if exactly two words were entered
        if (nameAndSurname.length == 2) {
            System.out.println("Name: " + nameAndSurname[0]);
            System.out.println("Surname: " + nameAndSurname[1]);
        } else {
            System.out.println("Please enter exactly two words (name and surname).");
        }
    }
}
