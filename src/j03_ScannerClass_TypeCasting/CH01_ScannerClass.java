package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class CH01_ScannerClass {

    public static void main(String[] args) {

        // The Scanner class is used in Java to take input from the user.
        // It is part of the java.util package, so you need to import it to use.
        // Example: import java.util.Scanner;

        // Step 1: Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Let's start with an example of getting a simple string input from the user.
        System.out.println("Enter your password: ");
        String password = input.nextLine(); // Takes the entire input as a string

        // Using regex to replace all digits in the password with '*'
        String maskedPassword = password.replaceAll("\\d", "*");
        System.out.println("Your masked password is: " + maskedPassword);

        // In the above code:
        // \\d is a regular expression pattern that matches any digit.
        // replaceAll("\\d", "*") replaces each digit with a '*'.

        /* ------------------------
           TASK 1: Square Area and Perimeter
           ------------------------ */
        // Let's calculate the area and perimeter of a square based on user input.
        System.out.println("Enter the side length of the square: ");
        int sideLength = input.nextInt(); // Takes an integer input for the side length

        int area = sideLength * sideLength; // Area formula: side^2
        int perimeter = 4 * sideLength;     // Perimeter formula: 4 * side

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        /* ------------------------
           TASK 2: Yearly Sugar Consumption
           ------------------------ */
        // Now, let's calculate how much sugar a person consumes in a year based on the cups of tea
        // they drink and the number of sugar cubes they use per cup.

        // 1 sugar cube = 1.7 grams
        System.out.println("How many cups of tea do you drink per day?");
        int teaCupsPerDay = input.nextInt(); // Takes input for the number of tea cups

        System.out.println("How many sugar cubes do you use per cup?");
        int sugarCubesPerCup = input.nextInt(); // Takes input for sugar cubes per cup

        // Calculate yearly sugar consumption in kg
        double yearlySugarConsumption = teaCupsPerDay * sugarCubesPerCup * 1.7 * 365 / 1000;
        System.out.println("Your yearly sugar consumption in kg is: " + yearlySugarConsumption);

        /* ------------------------
           TASK 3: Name Manipulation
           ------------------------ */
        // Next, let's ask for the user's name and perform some operations on the string.
        // For example, we'll print the first and last characters of the name.

        // Clearing the input buffer before taking a new line input
        input.nextLine();

        System.out.println("Enter your name: ");
        String name = input.nextLine(); // Takes the full name as input

        // Printing the first character of the name
        char firstChar = name.charAt(0);
        System.out.println("First letter of your name: " + firstChar);

        // Printing the length of the name
        System.out.println("Your name has " + name.length() + " characters.");

        // Printing the last character of the name
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("Last letter of your name: " + lastChar);

        /* ------------------------
           TASK 4: Additional Example - Basic Arithmetic
           ------------------------ */
        // Let's do another example with basic arithmetic.
        // We'll ask the user for two numbers and perform addition, subtraction, multiplication, and division.

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        /* ------------------------
           TASK 5: Type Casting Example
           ------------------------ */
        // Let's do a type casting example.
        // Suppose we have a double value, and we want to cast it to an integer.

        double doubleValue = 9.75;
        int intValue = (int) doubleValue; // This casts the double value to an int, truncating the decimal part

        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value after casting: " + intValue);

        // Closing the Scanner object
        input.close();
    }
}
