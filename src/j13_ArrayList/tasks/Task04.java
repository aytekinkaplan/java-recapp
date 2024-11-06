package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK:
         * Given a list of names as input,
         * create code to remove all names containing the letter 'a'.
         *
         * INPUT: list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"}
         * OUTPUT: [Veli, Omer]
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Omer");

        // Remove names containing the letter 'a'
        list.removeIf(name -> name.toLowerCase().contains("a"));

        System.out.println(list); // Output: [Veli, Omer]
    }
}
