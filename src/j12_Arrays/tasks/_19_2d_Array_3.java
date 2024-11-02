package j12_Arrays.tasks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Create a 2D String array as follows:
        [{"new jersey","atlanta","ohio"} ,
         {"Pittsburgh" ,"ohio","new york","ohio"},
         {"ohio","new york"}]

        Replace all occurrences of "ohio" with "Florida".
        Print the modified array.
         */

        String[][] arr = {
                {"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}
        };

        // Replace "ohio" with "Florida"
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("ohio")) {
                    arr[i][j] = "Florida";
                }
            }
        }

        // Print the modified array
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
