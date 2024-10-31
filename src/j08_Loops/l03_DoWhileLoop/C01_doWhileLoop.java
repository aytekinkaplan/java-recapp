package j08_Loops.l03_DoWhileLoop;

public class C01_doWhileLoop {
    public static void main(String[] args) {

         /*
        While loop -> first checks the condition; if true, it executes the loop body.
        Do-While loop -> first executes the loop body, then checks the condition.
        If the condition is true, the loop continues; if false, it stops and moves to the next code block.
        Do-While loop is often used in game applications.

        Trick: A while loop may not execute if the condition is false initially,
        but a do-while loop will always execute at least once, regardless of the condition.
         */

        // Allow access only if age is greater than 18
        int yas = 15;

        // Using a while loop
        while (yas > 18) {
            System.out.println("You can enter (while loop).");
            yas--;
        }

        // Using a do-while loop
        do {
            System.out.println("You can enter (do-while loop).");
            yas--;
        } while (yas > 18);
    }
}
