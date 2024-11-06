package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_StudentGrades {
    public static void main(String[] args) {
        /* TASK:
           Get as many grades as the teacher wants to enter, and
           create code to find the number of students whose grades exceed the average.
        */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Step 1: Collect all grades
        int sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
            sum += grade;
        }

        // Step 2: Calculate the average grade
        double average = (double) sum / numberOfStudents;
        System.out.println("The average grade is: " + average);

        // Step 3: Count the students with grades above the average
        int countAboveAverage = 0;
        for (int grade : grades) {
            if (grade > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of students with grades above the average: " + countAboveAverage);

        scanner.close();
    }
}
