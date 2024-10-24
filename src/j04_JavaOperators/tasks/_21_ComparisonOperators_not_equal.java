package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _21_ComparisonOperators_not_equal {

    public static void main(String[] args) {

        /*  2 double oluşturun.
            İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
            Double1'in double2'ye eşit olmadığını doğrulayın.
            Eğer eşit değilse cevap true olmalı.
            Cevabı yazdırınız.  */

        // Kodu aşağıya yazınız.
Scanner scanner = new Scanner(System.in); // Scanner objesi oluşturuldu. (6,4)-(27,9)
System.out.println("Enter first double number: ");
        double num1 = scanner.nextDouble(); // 14.23

        System.out.println("Enter second double number: ");
        double num2 = scanner.nextDouble(); // 19.52

        System.out.println(num1==num2 ? "These numbers are equal" : "These numbers are not equal");

    }
}
