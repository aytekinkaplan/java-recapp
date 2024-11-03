package j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* TASK:
     * Remove names containing the letter 'a' from the list.
     *
     * INPUT : list1={"Ali","Serap","Zeynep","Fuat"}
     * OUTPUT : [Zeynep]
     */

    public static void main(String[] args) {

        // Initial list of names with some containing the letter 'a'
        ArrayList<String> names = new ArrayList<>(List.of("Ali", "Serap", "Zeynep", "Fuat"));
        ArrayList<String> newNames = new ArrayList<>();

        System.out.println("Original names list = " + names); // Output: names = [Ali, Serap, Zeynep, Fuat]

        // Loop through names and add those without 'a' to newNames
        for (String name : names) {
            if (!name.toLowerCase().contains("a")) { // Checks if 'a' is absent
                newNames.add(name); // Adds names without 'a' to newNames
            }
        }
        System.out.println("Filtered newNames list = " + newNames); // Output: newNames = [Zeynep]

        // Clear the original list and add back filtered names
        names.clear();
        names.addAll(newNames);
        System.out.println("Updated names list = " + names); // Output: names = [Zeynep]
    }
}
