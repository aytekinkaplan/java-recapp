package j12_Arrays.tasks;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        Create a String array with elements: "Apple", "Orange", "Banana", "Pineapple".
        Check if the element "Apple" is present in the array.
        If it is, print "true" once.
        Use loops.
         */

        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean containsApple = false;

        // Check if "Apple" is in the array
        for (String fruit : fruits) {
            if (fruit.equals("Apple")) {
                containsApple = true;
                break;
            }
        }

        System.out.println(containsApple);
    }
}
