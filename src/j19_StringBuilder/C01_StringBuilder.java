package j19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {

    public static void main(String[] args) {
        /*
           String => slower, Immutable => cannot be changed directly,
           Once created, String objects cannot be changed without reassignment.

           1) Java uses pass-by-value
           2) The String class is immutable (unchangeable).

           StringBuffer = mutable => can be changed, less efficient, slower,
           StringBuffer is synchronized and thread-safe.

           StringBuilder = mutable => can be changed,
           not synchronized, not thread-safe, but more efficient (faster and more effective).

           1) The String class is immutable in Java. For mutable strings, Java introduced the StringBuilder class.
           2) The StringBuffer class, which is similar to StringBuilder, was created before StringBuilder.
              StringBuffer is slower, but it is synchronized and thread-safe.
           3) "Multi-threading" means multiple tasks running simultaneously.
              When multi-threading is involved, tasks need to be ordered in a process known as "synchronization."
         */

        String str = "javAslan";
        System.out.println("String before method call = " + str);
        concatenateString(str);
        System.out.println("String after method call = " + str);

        // Task: Compare runtime performance of String and StringBuilder in a loop with 50,000 iterations.

        String s = "a";
        StringBuilder sb1 = new StringBuilder("");

        // Measure time taken by String
        LocalTime strStartTime = LocalTime.now();
        System.out.println("String process started at " + strStartTime);
        for (int i = 0; i < 50000; i++) {
            s += i;
        }
        LocalTime strEndTime = LocalTime.now();
        System.out.println("String process ended at " + strEndTime);

        System.out.println("Time difference (nanoseconds): " + (strEndTime.getNano() - strStartTime.getNano()));

        // Measure time taken by StringBuilder
        LocalTime sbStartTime = LocalTime.now();
        System.out.println("StringBuilder process started at " + sbStartTime);
        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sbEndTime = LocalTime.now();
        System.out.println("StringBuilder process ended at " + sbEndTime);

        System.out.println("Time difference (nanoseconds): " + (sbEndTime.getNano() - sbStartTime.getNano()));
    }

    // Method to concatenate a string
    private static void concatenateString(String str) {
        System.out.println(str + " greetings from the method");
    }
}
