package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        /*
          TASK:
          Create a program that takes two numbers and applies a selected arithmetic operation (addition, subtraction, multiplication, or division),
          then prints the result.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Choose an operation: \n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int operation = input.nextInt();

        // Ternary operator to determine the result based on the selected operation
        String result = (operation == 1) ? "Result: " + (num1 + num2)
                : (operation == 2) ? "Result: " + (num1 - num2)
                : (operation == 3) ? "Result: " + (num1 * num2)
                : (operation == 4) ? (num2 != 0 ? "Result: " + (num1 / num2) : "Error: Division by zero")
                : "Invalid operation selection.";

        System.out.println(result);

        // Close the Scanner to free up resources
        input.close();
    }
}
