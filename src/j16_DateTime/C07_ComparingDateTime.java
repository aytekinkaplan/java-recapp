package j16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        // Define dates
        LocalDate today = LocalDate.now();          // Current date
        LocalDate yesterday = today.minusDays(1);   // Yesterday's date
        LocalDate futureDate = today.plusDays(10);  // 10 days from today
        LocalDate birthDate = LocalDate.of(2000, 2, 29); // Specific date

        System.out.println("Today = " + today);
        System.out.println("Yesterday = " + yesterday);
        System.out.println("Future date = " + futureDate);
        System.out.println("Birth date = " + birthDate);

        // Check if today is before or after certain dates
        System.out.println("Is today before yesterday? " + today.isBefore(yesterday)); // Expected: false
        System.out.println("Is today before future date? " + today.isBefore(futureDate)); // Expected: true
        System.out.println("Is today after future date? " + today.isAfter(futureDate)); // Expected: false

        // Check if birthDate is in a leap year
        System.out.println("Is birth date in a leap year? " + birthDate.isLeapYear()); // Expected: true

        // Compare today with futureDate using compareTo
        int difference = today.compareTo(futureDate);
        System.out.println("Difference (today vs. future date) = " + difference); // Expected: negative (today is before future date)

        // Compare today with birthDate
        System.out.println("Comparison (today vs. birth date) = " + today.compareTo(birthDate)); // Expected: positive (today is after birth date)
    }
}
