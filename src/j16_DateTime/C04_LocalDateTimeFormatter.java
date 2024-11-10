package j16_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDateTimeFormatter {
    public static void main(String[] args) {
        /*
        Formatting patterns:
            - DAY
                d    : Day number without leading zero (e.g., 7)
                dd   : Day number with leading zero (e.g., 07)
                DDD  : Day of the year (e.g., 189)
                E    : Abbreviated day name (e.g., Mon)
                EEEE : Full day name (e.g., Monday)

            - MONTH (Note: Use 'M' for month and 'm' for minutes)
                M: Month number without leading zero
                MM: Month number with leading zero
                MMM: Abbreviated month name (e.g., Jan)
                MMMM: Full month name (e.g., January)

            - YEAR
                YY: Last two digits of the year
                YYYY: Full year

            - HOUR (24-hour format uses 'H'; 12-hour format uses 'h')
                H: 24-hour format without leading zero
                HH: 24-hour format with leading zero
                h: 12-hour format without leading zero
                hh: 12-hour format with leading zero

            - MINUTE
                m: Minute without leading zero
                mm: Minute with leading zero

            - AM/PM
                a: Displays AM or PM

        */

        // Current date and time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current LocalDateTime = " + ldt);

        // Format date as MM/dd/yyyy (e.g., 02/23/2023)
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Formatted date (MM/dd/yyyy) = " + ldt.format(dateFormat));

        // Format time as HH:mm:ss (e.g., 11:22:00)
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted time (HH:mm:ss) = " + ldt.format(timeFormat));
        System.out.println("Time after 2 hours = " + ldt.plusHours(2).format(timeFormat));

        // Additional examples:
        // Full date and time with day and month names
        DateTimeFormatter fullDateTimeFormat = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        System.out.println("Full date and time = " + ldt.format(fullDateTimeFormat));

        // Custom format with AM/PM
        DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Custom time (hh:mm a) = " + ldt.format(customTimeFormat));
    }
}
