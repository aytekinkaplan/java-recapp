package j08_Loops.l01_ForLoop.tasks;

public class Odev05 {

    public static void main(String[] args) {

        /* Print all odd numbers from 100 down to 0.
           The output should exclude 100 and 0. */

        for (int i = 99; i > 0; i -= 2) {  // Start from 99 and decrease by 2 to get odd numbers
            System.out.println(i);
        }
    }
}
