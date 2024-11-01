package j12_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        // Converting a String to an array... split() -> splits the String based on the specified parameter value.

        String str = " tam oturmasi icin birkac ornek daha gerekir  ";

        String[] newArr = str.trim().split(" "); // Converted the string to an array

        System.out.println("str = " + str); // str = tam oturmasi icin birkac ornek daha gerekir
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));

        System.out.println("newArr.length = " + newArr.length);

        // Task: Print the character count in the 'str' object
        System.out.println("str.length() = " + str.length()); // str.length() = 46

        // Task: Print the number of letters used in the 'str' object
        String withoutSpaces = str.replaceAll("\\s", ""); // Removes all spaces
        System.out.println("withoutSpaces = " + withoutSpaces); // withoutSpaces = tamoturmasiicinbirkacornekdahagerekir

        String[] arrWithoutSpaces = withoutSpaces.split("");

        System.out.println("Arrays.toString(arrWithoutSpaces) = " + Arrays.toString(arrWithoutSpaces));
        // Arrays.toString(arrWithoutSpaces) = [t, a, m, o, t, u, r, m, a, s, i, i, c, i, n, b, i, r, k, a, c, o, r, n, e, k, d, a, h, a, g, e, r, e, k, i, r]

        System.out.println("arrWithoutSpaces.length = " + arrWithoutSpaces.length);
        // arrWithoutSpaces.length = 37

        System.out.println("withoutSpaces.split(\"\").length = " + withoutSpaces.split("").length);
        // withoutSpaces.split("").length = 37

    }
}
