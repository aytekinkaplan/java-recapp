package j19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // 1. Creating an empty StringBuilder object and using append to add text

        StringBuilder sb1 = new StringBuilder(); // Default capacity of 16, empty StringBuilder
        System.out.println("sb1.length() = " + sb1.length());  // Output: sb1.length() = 0
        System.out.println("sb1.capacity() = " + sb1.capacity());  // Output: sb1.capacity() = 16

        sb1.append("javAslan"); // Adds "javAslan" to the empty StringBuilder
        System.out.println("sb1 = " + sb1); // Output: sb1 = javAslan
        System.out.println("sb1.capacity() = " + sb1.capacity());  // Output: sb1.capacity() = 16

        sb1.append(" hello ")
                .append(" how are you ")
                .append(" did you get a raise? ")
                .append(63)
                .append(" ")
                .append(true);
        System.out.println("sb1 = " + sb1); // Combined text in sb1
        System.out.println("sb1.capacity() = " + sb1.capacity());  // Output: sb1.capacity() = 70

        // 2. Creating StringBuilder with initial text
        StringBuilder sb2 = new StringBuilder("Tommy Lee Jones");
        System.out.println("sb2.length() = " + sb2.length()); // Output: sb2.length() = 15
        System.out.println("sb2.capacity() = " + sb2.capacity()); // Output: sb2.capacity() = 31

        // trimToSize() reduces capacity to the current length
        System.out.println("Using trimToSize()");
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity()); // Output: sb2.capacity() = 15
        System.out.println("sb2.length() = " + sb2.length()); // Output: sb2.length() = 15

        // Specifying an initial capacity for StringBuilder
        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length()); // Output: sb3.length() = 0
        System.out.println("sb3.capacity() = " + sb3.capacity()); // Output: sb3.capacity() = 11
        sb3.append("Rumeysa QA"); // Adding text
        System.out.println("sb3.capacity() = " + sb3.capacity()); // Capacity increases as needed

        // Accessing a character at a specific index
        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));  // Output: sb3.charAt(4) = y

        // Getting a subsequence (a portion of the text) with subSequence
        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10)); // Output: sb1.subSequence(3,10) = Aslan s
        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10)); // Works similarly to subSequence

        // Removing characters between specified indices with delete()
        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10)); // Removes the range [3, 10)

        // Deleting a character at a specific index with deleteCharAt
        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6)); // Deletes character at index 6

        // Inserting text at a specified index
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(7, \";)\") = " + sb3.insert(7, ";)"));

        // Inserting part of a string at a specific index in a StringBuilder
        System.out.println("sb3.insert(15,\"hello\",1,3) = " + sb3.insert(15, "hello", 1, 3));

        // Replacing a character at a specified index
        sb3.setCharAt(5,'S');
        System.out.println("sb3 = " + sb3); // Changes character at index 5 to 'S'

        // Replacing a range of characters with replace
        System.out.println("sb3.replace(7,9,\"busy\") = " + sb3.replace(7, 9, "busy"));
    }
}
