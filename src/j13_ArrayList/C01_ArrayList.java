package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
     /*
     ArrayList General Definition:

        ArrayList<Type> arrayListName = new ArrayList<Type>();
             List<Type> arrayListName = new ArrayList<>();

         1. Type: This should be a Class, such as String, Integer, Double, Long, Byte, Short, Boolean, Object, etc.
            - `ArrayList<int>` is incorrect since the type must be a wrapper class (non-primitive type).
            - Wrapper classes for primitives start with capital letters:
                * `int` wrapper class -> `Integer`
                * `double` wrapper class -> `Double`, etc.

         2. ArrayLists do not need a defined size at initialization, unlike arrays.
            - Arrays have a fixed `.length`, but `ArrayList` can expand or shrink dynamically with `.size()`.

         3. Intellij may use `<>` at the end, such as `<~>`, which means the same as specifying the type inside `<Type>`.

    List Declarations:
    The main difference from arrays is `ArrayList` flexibility with size. Arrays have fixed lengths, while `ArrayList` length is dynamic.

    Keyword: List<Wrapper Class> name = new ArrayList<>();

    To assign values to a List:
    Lists cannot use primitive data types, so we use wrapper classes for data types. For example,
    - List<wrapper Class> name = new ArrayList<>()  -> Correct
    - ArrayList<wrapper Class> name = new ArrayList<>()  -> Correct

    Initializing ArrayLists:
    1. Method `asList()`:
       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
       Initializes `numbers` with 1, 2, and 3 as elements.
    2. Method `List.of()`:
       ArrayList<String> countries = new ArrayList<>(List.of("Germany", "France", "Italy"));

    Printing `ArrayLists`:
    ArrayLists can be directly printed with `System.out.println(arrayList)`, while arrays require `Arrays.toString(array)`.

    Collections:
    Collections in Java are groups of elements or objects, such as `ArrayList`, `Set`, `Vector`, and `Queue`.

 */

    public static void main(String[] args) {
        int number = 99;
        int[] arr = new int[5];
        int[][] arrMd = new int[5][6];

        // Declaring and creating an ArrayList
        ArrayList<String> names = new ArrayList<>(); // No size specification needed
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("names = " + names);   // names = []
        System.out.println("numbers = " + numbers);  // numbers = []

        // Adding elements to ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Daisy");

        System.out.println("names = " + names); // names = [Alice, Bob, Charlie, Daisy]

        numbers.add(55);
        numbers.add(65);
        numbers.add(34);
        numbers.add(35);

        System.out.println("numbers = " + numbers); // numbers = [55, 65, 34, 35]

        // Method 2: Adding elements using `Arrays.asList()`
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "Los Angeles", "Chicago"));
        System.out.println("cities = " + cities); // cities = [New York, Los Angeles, Chicago]

        // Method 3: Adding elements using `List.of()`
        ArrayList<String> countries = new ArrayList<>(List.of("USA", "Canada", "Mexico"));
        System.out.println("countries = " + countries); // countries = [USA, Canada, Mexico]

        // Accessing the ArrayList size
        System.out.println("Number of countries: " + countries.size()); // Number of countries: 3

        // Adding an element at a specific position
        countries.add(1, "Brazil");
        System.out.println("countries = " + countries); // countries = [USA, Brazil, Canada, Mexico]

        // Removing elements by index
        countries.remove(2); // Removes "Canada"
        System.out.println("countries after removal: " + countries); // countries = [USA, Brazil, Mexico]

        // Checking if an element exists
        System.out.println("Does countries contain Mexico? " + countries.contains("Mexico")); // true

        // Replacing an element
        countries.set(0, "Argentina");
        System.out.println("countries after replacement: " + countries); // countries = [Argentina, Brazil, Mexico]
    }
}
