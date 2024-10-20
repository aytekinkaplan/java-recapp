package j02_DataTypes_WrapperClass.tasks;

public class _05_create_boolean1 {

    public static void main(String[] args) {

        /* Create a boolean with the value 'true'.
           Print the boolean. */

        // Example 1: Boolean value 'true'
        boolean isTrue = true;
        System.out.println("Boolean value 1: " + isTrue);

        // Example 2: Boolean value 'false'
        boolean isFalse = false;
        System.out.println("Boolean value 2: " + isFalse);

        // Example 3: Using boolean with a comparison
        int a = 10;
        int b = 20;
        boolean isGreater = a > b;
        System.out.println("Is 'a' greater than 'b'? " + isGreater);

        // Example 4: Boolean with logical operation (AND)
        boolean condition = (a < b) && isTrue;
        System.out.println("Logical AND result: " + condition);

        // Example 5: Boolean with logical operation (OR)
        boolean orCondition = (a > b) || isTrue;
        System.out.println("Logical OR result: " + orCondition);
    }
}
