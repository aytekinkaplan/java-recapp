package j11_Debugger;

// Defines the package `j11_Debugger`, grouping related classes for debugging.

public class C03_Debugger {

    static int count = 7; // Declares a static global variable `count` initialized to 7 at the class level.

    public static void main(String[] args) {
        method01(); // Calls `method01` from the main method.
    } // End of main method

    private static void method01() {
        System.out.println(" ***** method 01 is running ***** ");
        int a = 0; // Declares a local variable `a` initialized to 0.
        count++; // Increments `count` by 1.

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            a += 2 * i; // Adds `2 * i` to `a` in each iteration.
        }
        System.out.println();
        System.out.println(" ***** method 02 is being called ******");
        method02(); // Calls `method02` from within `method01`.

        System.out.println(" ***** method 03 is being called ******");
        method03(); // Calls `method03` from within `method01`.

        System.out.println(" ***** method 01 has finished ***** ");
    }

    private static void method03() {
        System.out.println(" ***** method 03 is running ***** ");
        count -= 3; // Decrements `count` by 3.

        for (int x = 1; x < 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(" ***** method 03 has finished ***** ");
    }

    private static void method02() {
        System.out.println(" ***** method 02 is running ***** ");
        count += 5; // Increments `count` by 5.

        for (int x = 1; x < 7; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(" ***** method 02 has finished ***** ");
    }

} // End of class
