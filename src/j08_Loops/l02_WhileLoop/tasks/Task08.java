package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //	Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //	ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        //	yanlislikla kac negative sayi girdigini
        //	ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.


        Scanner input = new Scanner(System.in);
        int sumOfPositives = 0;
        int countOfPositives = 0;
        int countOfNegatives = 0;
        String output1 = "You have entered " + countOfPositives + " positive number(s).";
        String output2 = "You have entered " + countOfNegatives + " negative number(s).";
        String output3 = "Your total is " + sumOfPositives + ".";

        while (true) {
            System.out.println("Enter positive number or 0 to exit.");
            int number = input.nextInt();
            if (number > 0) {
                countOfPositives++;
                sumOfPositives += number;
            } else if (number < 0) {
                countOfNegatives++;
            } else if (number == 0) {
                System.out.println(output1);
                System.out.println(output2);
                System.out.println(output3);
                break;
            }

        }


    }
}
