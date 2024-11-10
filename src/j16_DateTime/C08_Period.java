package j16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        // Period represents the time between two dates

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1990, 8, 23);

        // Calculate the period between birthDate and today
        Period difference = Period.between(birthDate, today);
        System.out.println("Difference = " + difference); // Example: Difference = P32Y10M13D

        System.out.println("Years = " + difference.getYears()); // Example: Years = 32
        System.out.println("Months = " + difference.getMonths()); // Example: Months = 10
        System.out.println("Days = " + difference.getDays()); // Example: Days = 13

        // Using compareTo to find the year difference
        System.out.println("Year difference (compareTo) = " + today.compareTo(birthDate)); // Example: 33

        // Task: Calculate the end date of a 9-month course starting on May 2, 2023
        LocalDate startDate = LocalDate.of(2023, 5, 2);
        System.out.println("Course start date = " + startDate);

        // Define a period of 9 months
        Period courseDuration = Period.ofMonths(9);

        // Add the course duration to the start date to find the end date
        LocalDate endDate = startDate.plus(courseDuration);
        System.out.println("Course end date = " + endDate); // Example: 2024-02-02
    }
}
