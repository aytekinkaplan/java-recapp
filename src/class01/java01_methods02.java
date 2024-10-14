package class01;

import java.util.Scanner;

public class java01_methods02 {
    public static void main(String[] args) {
        String name = "";  // boş bir string ile tanımladık
        greeting(name);
    }

    private static void greeting(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();  // kullanıcıdan alınan değeri parametreye atıyoruz
        System.out.println("Hello " + name);
        sc.close();
    }
}
