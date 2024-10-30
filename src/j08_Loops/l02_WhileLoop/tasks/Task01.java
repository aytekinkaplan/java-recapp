package j08_Loops.l02_WhileLoop.tasks;

public class Task01 {
    public static void main(String[] args) {
/*
TaskSahaf.txt-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        int sum = 0;
        int count = 0;
        while (sum <= 333) {
            sum += 11;
            count++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);

    }
}
