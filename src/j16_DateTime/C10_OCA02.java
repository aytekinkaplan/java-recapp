package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C10_OCA02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014, 6, 21); // Option D
        LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21); // Option F

        System.out.println("date1 = " + date1); // Output: date1 = 2014-06-21
        System.out.println("date2 = " + date2); // Output: date2 = 2014-06-21
    }
}
