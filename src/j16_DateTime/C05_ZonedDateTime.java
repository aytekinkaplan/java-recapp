package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
        // Local date for a specific time zone (America/Chicago)
        LocalDate dateInZone = LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println("Date in Chicago = " + dateInZone); // e.g., Date in Chicago = 2023-07-06

        // ZonedDateTime for a specific time zone (America/Chicago)
        ZonedDateTime dateTimeInZone = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("Date and Time in Chicago = " + dateTimeInZone); // e.g., Date and Time in Chicago = 2023-07-06T14:23:12.345-05:00[America/Chicago]

        // ZonedDateTime for another time zone (Europe/Istanbul)
        ZonedDateTime dateTimeInIstanbul = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Date and Time in Istanbul = " + dateTimeInIstanbul); // e.g., Date and Time in Istanbul = 2023-07-06T22:23:12.345+03:00[Europe/Istanbul]

        // ZonedDateTime for Tokyo
        ZonedDateTime dateTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Date and Time in Tokyo = " + dateTimeInTokyo); // e.g., Date and Time in Tokyo = 2023-07-07T04:23:12.345+09:00[Asia/Tokyo]

        // List all available ZoneIds
        System.out.println("Available Zone IDs: ");
        ZoneId.getAvailableZoneIds().stream().limit(5).forEach(System.out::println); // Prints a few sample zone IDs
    }
}
