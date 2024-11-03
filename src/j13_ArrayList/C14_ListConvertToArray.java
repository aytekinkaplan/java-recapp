package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        // `toArray()` converts a list into an array.

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        System.out.println("city = " + city);
        // Output: city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        // Method 1: Converting to an Object array
        Object[] arrCity = city.toArray();
        System.out.println("arrCity = " + Arrays.toString(arrCity));
        // Output: arrCity = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        // Explanation: `toArray()` without arguments returns an Object array containing the list elements.

        // Method 2: Converting to a String array
        String[] arrCity2 = city.toArray(new String[0]);
        System.out.println("arrCity2 = " + Arrays.toString(arrCity2));
        // Output: arrCity2 = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        // Explanation: `toArray(T[] a)` returns an array of the same type as the specified array parameter.
    }
}
