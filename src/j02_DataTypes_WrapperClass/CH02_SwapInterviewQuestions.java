package j02_DataTypes_WrapperClass;

public class CH01_VariableCreate {

    public static void main(String[] args) {
        /*
            Variable:
            - A variable is a reserved area in memory that stores data.
            - A variable acts as a container that holds values.
            - When declaring a variable, you must choose the appropriate data type depending on the value it will store.
            - For example, a city's population should be stored in an integer type, not a String, boolean, char, or double type.
            - Throughout this course, we will generally use `int` for whole numbers and `double` for decimal numbers.
         */

        // Variable creation:
        // Syntax: DataType VariableName = value;
        // Example: int age = 48;

        // 1st approach (best practice):
        int age = 48;  // Always end the statement with a semicolon.
        int salary = 33000;

        // Printing variables:
        System.out.println("age"); // Output: age (prints the variable name, not the value)
        System.out.println(age);   // Output: 48 (prints the variable value)
        System.out.println(salary); // Output: 33000
        System.out.println("Starting salary for Ms. Nur: " + salary); // Output: Starting salary for Ms. Nur: 33000

        // 2nd approach:
        int height; // Variable declared without assigning a value (declaration)
        // System.out.println(height);  // Error: height not initialized (compile-time error)
        height = 175;  // Assigning value to the variable (initialization)
        System.out.println("Your height: " + height);  // Output: Your height: 175

        // 3rd approach:
        int dailyWage, personAge, weight;  // Multiple variables of the same data type declared at once.
        personAge = 33;
        dailyWage = 1000;
        weight = 99;

        int dailyIncome = 1500, year = 2022, mass = 99;  // Another way to declare and initialize multiple variables.

        // A variable can only be declared once but can be reassigned multiple times.
        System.out.println(dailyIncome); // Output: 1500

        dailyIncome = 1800;  // Reassigning a new value to the variable.
        System.out.println("Updated daily income: " + dailyIncome); // Output: Updated daily income: 1800

        // Print multiple variables in a single statement.
        System.out.println("Daily income: " + dailyIncome + ", Year: " + year + ", Age: " + age + ", Daily wage: " + dailyWage + ", Weight: " + weight);

        /*
            Important:
            - A variable can only be declared once in a scope.
            - Trying to declare it again will result in a compile-time error (CTE).
         */

        // int personAge; // This would cause a duplicate variable declaration error (CTE).

        int num1 = 5, num2 = 10;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);  // Output: Sum: 15

        int temperature = 25;
        System.out.println("Initial Temperature: " + temperature);  // Output: 25
        temperature = 30;  // Reassigning new value
        System.out.println("Updated Temperature: " + temperature);  // Output: 30

        boolean isRaining = false;
        System.out.println("Is it raining? " + isRaining);  // Output: false
        isRaining = true;
        System.out.println("Is it raining now? " + isRaining);  // Output: true


    }
}
