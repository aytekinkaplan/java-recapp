package j18_ImmutableClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        /*
          In Java, classes like Boolean, Short, Integer, Long, Float, Double, Character, and String are examples of immutable classes.
          Classes like BigDecimal, BigInteger, LocalDate, and LocalTime are also immutable (unchangeable).

          However, classes like Date, LocalDateTime, StringBuilder, StringBuffer, Arrays, and ArrayList are mutable (changeable).
         */

        // Example of an immutable class (LocalDate)
        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today);
        today.plusDays(5); // This operation does not change the original LocalDate instance
        System.out.println("Today after trying to add 5 days = " + today);

        // Example of an immutable class (LocalTime)
        LocalTime now = LocalTime.now();
        System.out.println("Current time = " + now);
        now.plusHours(5); // This operation does not change the original LocalTime instance
        System.out.println("Current time after trying to add 5 hours = " + now);

        // Example of a mutable class (Date)
        Date date = new Date();
        System.out.println("Date before change = " + date);
        date.setTime(155454545645L); // This operation changes the original Date instance
        System.out.println("Date after change = " + date);
    }
}
