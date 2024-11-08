package j18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {
        String a = "";

        String c = "2cfalse";
        a += 2;
        a += 'c';
        a += false;

        System.out.println("a = " + a); // Expected: 2cfalse
        String b = "2cfalse";
        System.out.println("b = " + b); // Expected: 2cfalse

        // Using '==' to compare references
        if (a == b) { // This condition will not be true, as 'a' and 'b' have different references
            System.out.println("a == b works");
        }

        if (a == "2cfalse") { // This condition will not be true; 'a' does not refer to the same object in the pool
            System.out.println("a == 2cfalse works");
        }

        if (c == b) { // This will work because 'c' and 'b' refer to the same object in the String constant pool
            System.out.println("c == b works");
        }

        // Using 'equals' to compare values
        if (a.equals("2cfalse")) { // This works because 'equals' compare content
            System.out.println("a equals 2cfalse");
        }

        if (a.equals(b)) { // This works because 'equals' compare content
            System.out.println("a equals b");
        }

        if (c.equals(b)) { // This works because 'equals' compare content
            System.out.println("c equals b");
        }
    }
}
