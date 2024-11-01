package j10_MethodCreation;

import static j10_MethodCreation.C05_SwitchCaseMethods.menu;


public class C05_Runner {
    /*
    Calling methods from a different class:
    1. If the method is static, it can be accessed directly using `ClassName.methodName()`.
    2. Methods from the same class can be called directly by their name.
    */

    public static void main(String[] args) {
        // The main method acts as the entry point to run methods from other classes.

        // TASK: Create an application that performs CRUD operations on usernames.
        // This app should prompt the user for input and allow for CRUD operations via methods in a different class.

        menu(); // Calls the menu method from C05_SwitchCaseMethods
    }
}
