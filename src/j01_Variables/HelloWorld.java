package j01_Variables;

public class HelloWorld {

    /*
        PROJECT CREATION:
        File -> New -> Project -> Next -> Name (Enter the name of the project, start with lowercase, e.g., javaPractice103104105) -> Finish.

        PACKAGE CREATION:
        Right-click on the Java folder -> New -> Package -> Enter the desired package name (start with lowercase, e.g., day01_variables).

        CLASS CREATION:
        Right-click on the created package -> New -> Class -> Enter the class name (start with uppercase, e.g., C01_Variables).
    */

    public static void main(String[] args) {
        // the main method is like the engine of a car. Everything inside must be "static" to be used here.

        // Single-line comments start with "//" and are ignored by the Java compiler.

        /*
         * Multi-line comments are written between "/*" and "*\/". Java ignores everything in this section.
         */

        // TASK: Print name, age, hometown, and profession to the console.

        System.out.print("My name: John Doe"); // prints text, but stays on the same line.
        System.out.println(" Age: 30"); // prints text and moves to the next line.
        System.out.println("Hometown: New York");
        System.out.println("Profession: Java Developer");

        /*
         * Trick: 
         * - "print" continues printing on the same line.
         * - "println" moves to the next line after printing.
         * - Every statement in Java must end with a semicolon ";", otherwise it results in a compile-time error (CTE).
         */
    }

    // Comments can be added outside the main method as well.
}
