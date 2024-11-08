package j18_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        // String literals are stored in the String Constant Pool
        String str1 = "coffee";
        String str2 = "coffee";

        // Strings created with 'new' are stored in the heap (outside the String Pool)
        String str3 = new String("coffee");
        String str4 = new String("coffee");

        // Comparison of String literals using '=='
        System.out.println("str1 == str2: " + (str1 == str2)); // Expected: true
        // Explanation: str1 and str2 point to the same object in the String Pool

        // Comparison of new String objects using '=='
        System.out.println("str3 == str4: " + (str3 == str4)); // Expected: false
        // Explanation: str3 and str4 are different objects, even though their content is the same

        // Comparison of String literals and new String objects using '=='
        System.out.println("str1 == str3: " + (str1 == str3)); // Expected: false
        // Explanation: str1 (from the pool) and str3 (from the heap) are not the same object

        // Comparison using 'equals' method
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Expected: true
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // Expected: true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Expected: true
        // Explanation: 'equals' checks the content of the strings, so all comparisons return true
    }
}
