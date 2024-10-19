package ch01_Variables;

public class CH01_Variables {

    /*
        TASK:
        1. Declare variables for your name, age, and whether you are a student.
        2. Use appropriate data types and assign values to these variables.
        3. Print these variables to the console.

        Note:
        - Variable assignment is done using the assignment operator `=`.
        - `String` is used for text, `int` for whole numbers, and `boolean` for true/false values.
    */

    public static void main(String[] args) {
        // Declaring a String variable 'name' and assigning it the value "John".
        String name = "John";

        // Declaring an int variable 'age' and assigning it the value 25.
        int age = 25;

        // Declaring a boolean variable 'isStudent' and assigning it the value true.
        boolean isStudent = true;

        // Printing variables to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);

        /*
            Example: Another task - Declare variables for name, age, and salary.
            Print the details to the console.
        */

        String fullName = "Alice Doe";
        int personAge = 28;
        double salary = 45000.50; // Use 'double' for decimal numbers

        System.out.println("Full Name: " + fullName);
        System.out.println("Person Age: " + personAge);
        System.out.println("Salary: " + salary);

        /*
            Variable Reassignment Example:
            Variables can be reassigned with new values after declaration.
        */

        String newName = "Mike";
        System.out.println("Old Name: " + name); // Prints John
        newName = "Michael";  // New value assigned to 'newName'
        System.out.println("Updated Name: " + newName); // Prints Michael

        /*
            Variable without Initialization:
            You can declare a variable without assigning it a value.
            However, you must assign a value before using it in a print statement.
        */

        int height; // Variable declared but not initialized.
        height = 180; // Now it is initialized
        System.out.println("Height: " + height); // Prints 180

        /*
            Multiple Variable Declaration:
            Multiple variables can be declared in a single line, but they should all be of the same data type.
        */

        int length = 100, width = 50, depth = 10; // Multiple variables initialized in one line.
        System.out.println("Length: " + length + ", Width: " + width + ", Depth: " + depth);

        /*
            String Concatenation:
            We can concatenate multiple strings and variables using the `+` operator.
        */

        String school = "Clarusway";
        String department = "Software Testing";
        String grade = "A";

        System.out.println("School: " + school + ", Department: " + department + ", Grade: " + grade);

        /*
            Scope of Variables:
            Variables are created in the scope they are declared in.
            When that scope ends (e.g., the method or block), the variables "die" or are no longer accessible.
        */
    }
}
