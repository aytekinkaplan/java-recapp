package j16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        // Define two times: gece (night) and gunduz (day)
        LocalTime gece = LocalTime.of(0, 17); // 12:17 AM
        LocalTime gunduz = LocalTime.of(17, 30); // 5:30 PM

        // Calculate the duration (difference) between gece and gunduz
        Duration fark = Duration.between(gece, gunduz);
        // Note: The later time should be the second argument. If reversed, Duration will be negative.

        System.out.println("Duration = " + fark); // Full duration in hours, minutes, seconds
        System.out.println("Seconds difference = " + fark.getSeconds());
        System.out.println("Hours difference = " + fark.toHours());
        System.out.println("Minutes difference = " + fark.toMinutes());
    }
}
