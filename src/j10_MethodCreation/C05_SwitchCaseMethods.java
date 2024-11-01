package j10_MethodCreation;

import java.util.ArrayList;
import java.util.Scanner;

public class C05_SwitchCaseMethods {
    private static ArrayList<String> usernames = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Username Management ---");
            System.out.println("1. Create Username");
            System.out.println("2. Read Usernames");
            System.out.println("3. Update Username");
            System.out.println("4. Delete Username");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createUsername();
                    break;
                case 2:
                    readUsernames();
                    break;
                case 3:
                    updateUsername();
                    break;
                case 4:
                    deleteUsername();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createUsername() {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        usernames.add(username);
        System.out.println("Username added successfully.");
    }

    private static void readUsernames() {
        System.out.println("\n--- List of Usernames ---");
        if (usernames.isEmpty()) {
            System.out.println("No usernames found.");
        } else {
            for (String username : usernames) {
                System.out.println("- " + username);
            }
        }
    }

    private static void updateUsername() {
        System.out.print("Enter username to update: ");
        String oldUsername = scanner.nextLine();

        if (usernames.contains(oldUsername)) {
            System.out.print("Enter new username: ");
            String newUsername = scanner.nextLine();
            usernames.set(usernames.indexOf(oldUsername), newUsername);
            System.out.println("Username updated successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }

    private static void deleteUsername() {
        System.out.print("Enter username to delete: ");
        String username = scanner.nextLine();

        if (usernames.remove(username)) {
            System.out.println("Username deleted successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }
}
