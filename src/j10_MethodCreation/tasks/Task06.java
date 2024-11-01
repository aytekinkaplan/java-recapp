package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		/*
		 Prompt the user to select a shape (square, rectangle, or triangle)
		 and enter the dimensions. Then, calculate and display the area and circumference of the chosen shape.
		*/
        System.out.print("Select a shape (square, rectangle, or triangle): ");
        String shape = sc.nextLine().toLowerCase();

        switch (shape) {
            case "square":
                System.out.print("Enter the side length of the square: ");
                int side = sc.nextInt();
                calculateSquare(side);
                break;
            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                int length = sc.nextInt();
                System.out.print("Enter the width of the rectangle: ");
                int width = sc.nextInt();
                calculateRectangle(length, width);
                break;
            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                int base = sc.nextInt();
                System.out.print("Enter the height of the triangle: ");
                int height = sc.nextInt();
                calculateTriangle(base, height);
                break;
            default:
                System.out.println("Invalid shape selected.");
        }
    }

    public static void calculateSquare(int side) {
        int area = side * side;
        int circumference = 4 * side;
        System.out.println("The area of the square is: " + area);
        System.out.println("The circumference of the square is: " + circumference);
    }

    public static void calculateRectangle(int length, int width) {
        int area = length * width;
        int circumference = 2 * (length + width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The circumference of the rectangle is: " + circumference);
    }

    public static void calculateTriangle(int base, int height) {
        int area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
        System.out.println("To calculate the circumference, please provide all three side lengths.");
        // Optionally, we could extend this method to take three sides for the circumference.
    }
}
