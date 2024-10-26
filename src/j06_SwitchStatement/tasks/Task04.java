package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
        /*
         TASK: Create a program that prints the number of days in a month based on the month name entered by the user.
         Include leap year support for February (28 or 29 days).
        */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter month: ");
		String month = scan.next();

		if (month.equalsIgnoreCase("February")) {
			// For February, ask for the year to check if it's a leap year
			System.out.print("Enter year: ");
			int year = scan.nextInt();

			// Leap year check: divisible by 4, not divisible by 100, or divisible by 400
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
		} else {
			// Switch statement for other months
			switch (month) {
				case "January":
				case "March":
				case "May":
				case "July":
				case "August":
				case "October":
				case "December":
					System.out.println("31 days");
					break;
				case "April":
				case "June":
				case "September":
				case "November":
					System.out.println("30 days");
					break;
				default:
					System.out.println("Invalid month");
					break;
			}
		}

		scan.close();
	}
}
