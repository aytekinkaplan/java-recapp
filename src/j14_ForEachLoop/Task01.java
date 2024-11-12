package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK:
           Get as many grades as the teacher wants, then
           create code to find the number of students who scored above the average.
         */

        List<Integer> gradeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String continueInput;

        // Collect grades from the user
        do {
            System.out.print("Enter a grade: ");
            int studentGrade = input.nextInt();
            gradeList.add(studentGrade);

            System.out.print("Do you want to continue? Press (E) for yes, (H) for no: ");
            continueInput = input.next();
        } while (continueInput.equalsIgnoreCase("E"));

        // Sort and print the list of grades
        Collections.sort(gradeList);
        System.out.println("Sorted list of grades: " + gradeList);

        // Calculate the average grade
        int totalGrades = 0;
        for (int grade : gradeList) {
            totalGrades += grade;
        }
        double average = (double) totalGrades / gradeList.size();
        System.out.println("Average grade = " + average);

        // Count and print grades above average
        int countAboveAverage = 0;
        System.out.print("Grades above average: ");
        for (int grade : gradeList) {
            if (grade > average) {
                countAboveAverage++;
                System.out.print(grade + " ");
            }
        }

        System.out.println();
        System.out.println("Number of grades above average = " + countAboveAverage);
    }
}
