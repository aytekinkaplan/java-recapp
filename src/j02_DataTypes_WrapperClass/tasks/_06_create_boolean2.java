package j02_DataTypes_WrapperClass.tasks;

public class _06_create_boolean2 {

    public static void main(String[] args) {

        /* Create a boolean with the value 'false'.
           Print the boolean. */

        // Example 1: Boolean value 'false'
        boolean isFalse = false;
        System.out.println("Boolean value 1: " + isFalse);

        // Example 2: Boolean value 'true'
        boolean isTrue = true;
        System.out.println("Boolean value 2: " + isTrue);

        // Example 3: Using boolean in a conditional expression
        int x = 5;
        int y = 10;
        boolean isEqual = x == y;
        System.out.println("Is 'x' equal to 'y'? " + isEqual);

        // Example 4: Boolean with a logical NOT operation
        boolean notFalse = !isFalse;
        System.out.println("Logical NOT of 'false': " + notFalse);

        // Example 5: Combining two booleans with logical AND
        boolean andCondition = isTrue && isFalse;
        System.out.println("Logical AND result: " + andCondition);

        // Example 6: Combining two booleans with logical OR
        boolean orCondition = isTrue || isFalse;
        System.out.println("Logical OR result: " + orCondition);
    }
}
