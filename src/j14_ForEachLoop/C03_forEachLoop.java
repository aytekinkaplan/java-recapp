package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachLoop {

    public static void main(String[] args) {
        // Task: Check for common elements between two string arrays and print them.

        String[] arr1 = {"zerrin", "fatih", "mustafa", "zeynep", "iclal", "musa", "kasim", "john"};
        String[] arr2 = {"christina", "bale", "mustafa", "zeynep", "iclal", "moossa", "reese", "angel"};

        List<String> commonNames = new ArrayList<>();

        // Using nested for-each loop to find common elements
        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equalsIgnoreCase(str2)) {
                    commonNames.add(str1);
                    break; // Avoid adding duplicates if multiple matches are found
                }
            }
        }

        // Print result
        if (commonNames.isEmpty()) {
            System.out.println("No common names found.");
        } else {
            System.out.println("Common names: " + commonNames);
        }
    }
}
