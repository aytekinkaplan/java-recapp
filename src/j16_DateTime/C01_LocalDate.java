package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {
        // LocalDate -> Holds only year, month, and day
        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today); // Outputs today's date, e.g., Today = 2023-07-05

        // Check if the current year is a leap year
        System.out.println("Is this year a leap year? " + today.isLeapYear()); // e.g., false

        // Retrieve and display specific parts of the date
        System.out.println("Year = " + today.getYear()); // e.g., 2023
        System.out.println("Era = " + today.getEra()); // CE stands for "Common Era" (AD)

        // Day of the year
        System.out.println("Day of the year = " + today.getDayOfYear()); // e.g., 186

        // Creating specific dates
        LocalDate date1 = LocalDate.of(1990, 8, 23); // August 23, 1990
        LocalDate date2 = LocalDate.of(1996, 8, 23); // August 23, 1996
        LocalDate date3 = LocalDate.of(1990, Month.AUGUST, 23); // Same as date1 but using Month enum

        System.out.println("Date1 = " + date1); // e.g., Date1 = 1990-08-23

        // Add 300 days to date1
        System.out.println("Date1 + 300 days = " + date1.plusDays(300)); // e.g., 1991-06-19

        // Subtract 3 months from date2
        System.out.println("Date2 - 3 months = " + date2.minusMonths(3)); // e.g., 1996-05-23

        // Complex manipulation of date2
        System.out.println("Complex manipulation of Date2 = " +
                date2.minusMonths(3)
                        .plusMonths(2)
                        .plusDays(25)
                        .minusWeeks(3));
        // Example output: 1996-07-27

        // date2 remains unchanged after the above manipulation since LocalDate is immutable
        System.out.println("Date2 (unchanged) = " + date2); // e.g., Date2 = 1996-08-23

        // Update date2 by adding 100 years (modifies date2 as we reassign it)
        date2 = date2.plusYears(100);
        System.out.println("Date2 + 100 years = " + date2); // e.g., 2096-08-23
    }
}
