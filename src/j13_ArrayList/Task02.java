package j13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task02 {
    public static void main(String[] args) {
        /* TASK:
        Given a two-dimensional array, create a method that copies all elements into a list
        and sorts them in alphabetical order.
        Example Input: {{Ali, Veli, Ayse}, {Hasan, Can}, {Suzan}}
        Example Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]
        */

        String[][] mdArray = {{"Ali", "Fatih", "Hasan"}, {"Derya", "Zeynep"}, {"Tommy"}};

        // Calling the method and printing the sorted list
        ArrayList<String> sortedList = arrayConvertToList(mdArray);
        System.out.println("Sorted nameList = " + sortedList); // Expected sorted output
    }

    private static ArrayList<String> arrayConvertToList(String[][] str) {
        ArrayList<String> nameList = new ArrayList<>();

        // Loop through each element in the 2D array and add it to nameList
        for (String[] innerArray : str) {
            for (String name : innerArray) {
                nameList.add(name);
            }
        }

        // Sort the list alphabetically
        Collections.sort(nameList);

        return nameList;
    }
}
