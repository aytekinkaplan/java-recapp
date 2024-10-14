package class01;

import java.util.Scanner;

public class java01_methods03 {
    public static void main(String[] args) {
        greeting("John", "Doe");

    }

    private static void greeting(String name, String surName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();  // kullanıcıdan alınan değeri parametreye atıyoruz
        System.out.println("What is your surname?");
        surName = sc.nextLine();  // kullanıcıdan alınan değeri parametreye atıyoruz
        System.out.println("Hello " + name.toLowerCase().charAt(0).toUpperCase() + " " + surName.toLowerCase().charAt(0).toUpperCase() + ".");
        sc.close();
    }
}
