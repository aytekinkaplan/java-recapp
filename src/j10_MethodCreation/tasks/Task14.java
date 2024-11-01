package j10_MethodCreation.tasks;

public class Task14 {

    public static void main(String[] args) {
        /*
        Task: Create a method to calculate overtime pay and return the total earnings.

        The user should provide the hourly wage, the start and end time of the work hours,
        and the overtime multiplier if overtime is worked.

        Example:
        Hourly wage: 40.0
        Start time: 9.0
        End time: 20.0
        Overtime multiplier: 1.8

        calculateEarnings(9.0, 20.0, 40.0, 1.8);

        Explanation:
        Between 9 and 17, regular work hours are 8, so 8 x 40 = 320.
        Between 17 and 20, overtime hours are 3, so 3 x 40 x 1.8 = 216.

        Total = 536.0
        */

        System.out.println("Total earnings: " + calculateEarnings(9.0, 20.0, 40.0, 1.8));
    }

    // Method to calculate total earnings with overtime pay
    public static double calculateEarnings(double startHour, double endHour, double hourlyRate, double overtimeMultiplier) {
        double regularHours = Math.min(17, endHour) - startHour;
        double regularPay = Math.max(0, regularHours) * hourlyRate;

        double overtimeHours = endHour > 17 ? endHour - 17 : 0;
        double overtimePay = overtimeHours * hourlyRate * overtimeMultiplier;

        return regularPay + overtimePay;
    }
}
