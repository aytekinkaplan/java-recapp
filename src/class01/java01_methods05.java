package class01;

import java.io.Console;

public class java01_methods05 {
    public static void main(String[] args) {
        greeting("John", "Doe");
    }

    private static void greeting(String name, String surName) {
        Console console = System.console();

        if (console != null) {
            System.out.println("What is your name?");
            name = console.readLine();  // kullanıcıdan alınan değeri parametreye atıyoruz

            System.out.println("What is your surname?");
            surName = console.readLine();  // kullanıcıdan alınan değeri parametreye atıyoruz

            // İlk harfi büyük yapıp geri kalanını küçük yapmak
            String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            String formattedSurName = surName.substring(0, 1).toUpperCase() + surName.substring(1).toLowerCase();

            System.out.println("Hello " + formattedName + " " + formattedSurName + ".");
        } else {
            System.out.println("Console not available");
        }
    }
}
