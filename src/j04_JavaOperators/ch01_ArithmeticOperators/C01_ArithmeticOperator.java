package j04_JavaOperators.ch01_ArithmeticOperators;

public class C01_ArithmeticOperator {

    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 10;
        int b = 3;
        int c = 7;

        // Perform arithmetic operations and print the result
        System.out.println(b + a * c);  // Multiplication happens first, then addition
        System.out.println(c - a / (c - b) + a * b);  // Division, subtraction, and multiplication

        // Declare and initialize more variables, including a string
        int g = 2;
        int h = 3;
        String str = "Java";

        // String concatenation with arithmetic operations
        System.out.println((h + h) + str + " " + (g * h) + " " + (g - h));
    }
}
