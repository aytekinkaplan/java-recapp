package class01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class java01_methods04 {
    public static void main(String[] args) throws IOException {
        greeting("John", "Doe");
    }

    private static void greeting(String name, String surName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        name = reader.readLine();  // kullanıcıdan alınan değeri parametreye atıyoruz

        System.out.println("What is your surname?");
        surName = reader.readLine();  // kullanıcıdan alınan değeri parametreye atıyoruz

        // İlk harfi büyük yapıp geri kalanını küçük yapmak
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String formattedSurName = surName.substring(0, 1).toUpperCase() + surName.substring(1).toLowerCase();

        System.out.println("Hello " + formattedName + " " + formattedSurName + ".");
    }
}
