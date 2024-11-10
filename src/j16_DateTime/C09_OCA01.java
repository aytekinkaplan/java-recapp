package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C09_OCA01 {

    public static void main(String[] args) {
        // Option 1: Using ISO_DATE with LocalDate
        String date = LocalDate.parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formatted date (ISO_DATE) = " + date); // Output: 2014-05-04

        // Option 2: Using ISO_DATE_TIME with LocalDateTime
        String dateTime = LocalDateTime.parse("2014-05-04T00:00:00")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Formatted date-time (ISO_DATE_TIME) = " + dateTime); // Output: 2014-05-04T00:00:00
    }
}
