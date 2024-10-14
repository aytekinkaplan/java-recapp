package class01;

import java.util.Scanner;

public class java01_methods04 {
    public static void main(String[] args) {
        greeting("John", "Doe");
    }

    private static void greeting(String name, String surName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();  // kullanıcıdan alınan değeri parametreye atıyoruz
        System.out.println("What is your surname?");
        surName = sc.nextLine();  // kullanıcıdan alınan değeri parametreye atıyoruz

        // İlk harf büyük, geri kalan harfler küçük olacak şekilde dönüştürme
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String formattedSurName = surName.substring(0, 1).toUpperCase() + surName.substring(1).toLowerCase();

        System.out.println("Hello " + formattedName + " " + formattedSurName + ".");
        sc.close();
    }
}
