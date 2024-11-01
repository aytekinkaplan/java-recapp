package j10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {

    // Class-level variables
    static Scanner input = new Scanner(System.in); // Shared input scanner for all methods
    static String staticUserName = ""; // Stores the username for CRUD operations

    public static void createUser() {
        // Method to create a new user
        System.out.println("Enter a username:");
        String userName = input.nextLine(); // Temporary username for this method

        staticUserName = userName; // Assign the entered name to staticUserName for future operations
        System.out.println("User created: " + userName);
        System.out.println(userName + " has been registered in the system.");
    }

    public static void getUser() {
        // Method to check if a username exists in the system
        System.out.println("Enter the username you want to query:");
        String userName = input.nextLine();

        if (userName.equals(staticUserName)) {
            System.out.println("User " + userName + " exists in the system.");
        } else {
            System.out.println("User " + userName + " does NOT exist in the system (404 not found).");
        }
    }

    public static void updateUser() {
        // Method to update the existing username
        System.out.println("Your current username is: " + staticUserName);
        System.out.println("Enter a new username:");

        String newName = input.nextLine();
        staticUserName = newName; // Update the staticUserName with the new value

        System.out.println("Username successfully updated (200 OK).");
        System.out.println("Your new username is: " + staticUserName);
    }

    public static void deleteUser() {
        // Method to delete the existing username
        System.out.println("Enter the username you want to delete:");
        String deleteName = input.nextLine();

        if (deleteName.equals(staticUserName)) {
            System.out.println("User " + staticUserName + " has been deleted from the system.");
            staticUserName = null; // Set staticUserName to null to indicate deletion
            System.out.println("Deleted username: " + deleteName);
        } else {
            System.out.println("User " + deleteName + " does NOT exist in the system (404 not found).");
        }
    }

    public static void cikis() {
        // Method to exit the application
        System.out.println("You have logged out. Please come back again!");
    }
}
