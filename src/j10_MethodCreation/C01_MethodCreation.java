package j10_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) { // main method start

        /*
        To improve code readability and simplicity, frequently used actions are defined as separate methods.
        These methods are then called from the main method, making the application easier to test, maintain, and reuse.

        1) Java methods are executed based on both the method's name and its parameters. This includes:
           - Number of parameters
           - Data types of parameters
           - Order of parameters

           For example, str.endsWith("el") checks if a string ends with a specified substring.
           Knowing what the method returns (e.g., true/false) is essential for effective use.

        2) When a method is created, its intended action and output should be well-defined.

        3) While defining a method, we specify the types and names of any parameters it expects,
           as shown in "str.indexOf(String str, int fromIndex)".
           When calling the method, ensure that the arguments provided match the defined parameter types.
    */

        System.out.println("Starting method creation");

        topla(); // Calls a parameterless method

        // Task 1: Create a method that takes two integers, adds them, and returns the result
        System.out.println("topla2(55, 72) = " + topla2(55, 72));

        int result = topla2(33, 22);
        System.out.println("Result = " + result);

        int a = 21;
        int b = 34;
        System.out.println("topla2(a, b) = " + topla2(a, b));

        topla3(); // Calls another parameterless method

    } // end of main method

    private static void topla3() { // A parameterless method created by IntelliJ
        int a = 55;
        int b = 9;
        System.out.println(a + b);
        System.out.println("Greetings from topla3 method");

        topla(); // Calls the 'topla' method from within this method
    }

    public static int topla2(int sayi1, int sayi2) { // Method for Task 1
        int sum = sayi1 + sayi2;
        return sum; // Return the result; this should be the last line in the method
    }

    private static void topla() { // A basic parameterless method
        System.out.println("Our first created method");
        int a = 55;
        int b = 44;
        System.out.println(a + b);
        System.out.println("The 'topla' method has been executed");
    }

} // end of class body
