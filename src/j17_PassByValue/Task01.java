package j17_PassByValue;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        // Example with primitive type (int)
        int x = 10;
        int y = x; // y is assigned a copy of x's value
        x = 20; // modifying x does not affect y
        System.out.println("x = " + x); // Expected: 20
        System.out.println("y = " + y); // Expected: 10

        // Example with String (immutable reference type)
        String s1 = "hello";
        String s2 = s1; // s2 points to the same "hello" object as s1
        s1 = "world"; // reassigning s1 creates a new "world" object
        System.out.println("s1.toUpperCase() = " + s1.toUpperCase()); // Expected: WORLD
        System.out.println("s1 = " + s1); // Expected: world
        System.out.println("s2 = " + s2); // Expected: hello

        // Example with ArrayList (mutable reference type)
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = list1; // list2 refers to the same object as list1
        list1.add(3); // modifying list1 also affects list2
        System.out.println("list1 = " + list1); // Expected: [1, 2, 3]
        System.out.println("list2 = " + list2); // Expected: [1, 2, 3]
    }
}
