package j10_MethodCreation;

public class C04_MethodOverloading {

    public static void main(String[] args) {

        String str = "tam oturmasi icin birkac ornek daha gerekir";

        // Using overloaded methods from String class as an example
        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o")); // Finds first occurrence of 'o'
        System.out.println("str.indexOf(5) = " + str.indexOf(5)); // Finds first occurrence of character at index 5

        System.out.println("overloading demonstration:");

        // Calling overloaded methods defined in this class
        topla(); // No parameters
        topla(1, 5); // Two int parameters
        System.out.println("topla(1,2,4) = " + topla(1, 2, 4)); // Three int parameters
        System.out.println("topla('a', 'b','c') = " + topla('a', 'b', 'c')); // Three char parameters
        System.out.println("topla(12, 23.5) = " + topla(12, 23.5)); // int and double parameters
        System.out.println("topla(\"A\" , \"B\") = " + topla("A", "B")); // Two String parameters
    }

    private static String topla(String a, String b) {
        System.out.println("Method with two String parameters executed");
        return a + b;
    }

    private static double topla(int i, double v) {
        System.out.println("Method with int and double parameters executed");
        return i + v;
    }

    private static int topla(int i, int i1, int i2) {
        System.out.println("Method with three int parameters executed");
        return i + i1 + i2;
    }

    private static void topla(int i, int i1) {
        System.out.println("Method with two int parameters executed");
        System.out.println(i + i1);
    }

    private static void topla() {
        System.out.println("Method with no parameters executed");
        System.out.println(35 + 85);
    }
}
