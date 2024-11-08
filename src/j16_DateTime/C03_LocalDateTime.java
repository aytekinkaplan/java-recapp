package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime -> holds both date and time information

        // Get the current date and time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current LocalDateTime = " + ldt); // e.g., 2023-07-06T20:53:49.472739600

        // Separately, get the current date and time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // Combine LocalDate and LocalTime into a LocalDateTime
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println("Combined LocalDateTime = " + dt); // e.g., 2023-07-06T20:56:21.219966800

        // Adding 3 years to the combined LocalDateTime
        System.out.println("DateTime after 3 years = " + dt.plusYears(3)); // e.g., 2026-07-06T20:59:38.354164200
    }
}
