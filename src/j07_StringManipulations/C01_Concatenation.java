package j07_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
            The concat() method appends the given string to the end of the original string.
            In Java, if there’s at least one string in an expression, the + operator performs string concatenation instead of addition.
         */

        String name = "Batu";
        String title = "SDET QA";
        int age = 30;

        // Demonstrating string concatenation using + and concat() method
        System.out.println(name + title); // BatuSDET QA
        System.out.println("name.concat(title) = " + name.concat(title)); // name.concat(title) = BatuSDET QA

        // Displaying integer values
        System.out.println("age = " + age); // age = 30
        System.out.println(age); // 30

        // Converting a string to an integer for arithmetic
        String number = "123456";
        System.out.println("number = " + number + 1); // number = 1,234,561 (concatenates 1 as a string)

        // To achieve arithmetic addition, parse the string to an integer
        System.out.println("Integer.parseInt(number) + 1 = " + (Integer.parseInt(number) + 1)); // 123457

        // Concatenating non-string values using the concat() method
        System.out.println("name.concat(true + \" :) \") = " + name.concat(true + " :) ")); // Batutrue :)
        System.out.println("name.concat(100 + \" :) \") = " + name.concat(100 + " :) ")); // Batu100 :)

        // Example of concatenating boolean value with the title
        System.out.println("title.concat(false + \" Kasim\") = " + title.concat(false + " Kasim")); // SDET QAfalse Kasim
    }
}
