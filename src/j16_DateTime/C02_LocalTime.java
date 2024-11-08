package j16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {
        // LocalTime -> Holds hour, minute, second, nanosecond

        // Get current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time = " + now); // Example: Current time = 20:40:37.679398100

        // Get only the hour
        System.out.println("Current hour = " + now.getHour()); // Example: Current hour = 20

        // Creating a specific time
        LocalTime specificTime = LocalTime.of(13, 55, 55);
        System.out.println("Specific time = " + specificTime); // Specific time = 13:55:55

        // Adding nanoseconds to the specific time
        System.out.println("Specific time plus nanoseconds = " + specificTime.plusNanos(125421153413323L));
        // Example output: 00:46:16.153413323

        // Performance testing with time measurement
        System.out.println("Performance test:");
        LocalTime startTime = LocalTime.now();
        System.out.println("Start time in nanoseconds = " + startTime.getNano());

        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        LocalTime endTime = LocalTime.now();
        System.out.println("End time in nanoseconds = " + endTime.getNano());

        // Calculate and print the time differences
        System.out.println("Time difference in nanoseconds = " + (endTime.getNano() - startTime.getNano()));
        System.out.println("Time difference in minutes = " + (endTime.getMinute() - startTime.getMinute()));
        System.out.println("Time difference in seconds = " + (endTime.getSecond() - startTime.getSecond()));
    }
}
