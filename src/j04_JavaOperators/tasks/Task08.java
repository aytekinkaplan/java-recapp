package j04_JavaOperators.tasks;

public class Task08 {
    /*
     * Write a program that converts seconds into hours, minutes, and seconds.
     * Example: 4250 seconds -> 1 hour 10 minutes 50 seconds
     * 1 hour = 3600 seconds
     * 1 minute = 60 seconds
     */

    public static void main(String[] args) {
        // Define the number of seconds to be converted
        int totalSeconds = 4250;

        // Calculate the number of hours
        int hours = totalSeconds / 3600;  // 1 hour = 3600 seconds
        totalSeconds %= 3600;  // Remaining seconds after extracting hours

        // Calculate the number of minutes
        int minutes = totalSeconds / 60;  // 1 minute = 60 seconds
        totalSeconds %= 60;  // Remaining seconds after extracting minutes

        // The remaining seconds
        int seconds = totalSeconds;

        // Print the result
        System.out.println(hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
    }
}
