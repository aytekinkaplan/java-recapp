package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
TaskSahaf.txt-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sum <= 333) {
            int number = scanner.nextInt();
            sum += number;
            count++;

        }
        System.out.println(count);
        System.out.println(sum);
    }
}
