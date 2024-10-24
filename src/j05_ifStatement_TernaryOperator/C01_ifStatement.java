package j05_ifStatement_TernaryOperator;

public class C01_ifStatement {

    public static void main(String[] args) {

        int ageOfMeryem = 35;
        int ageOfAhmet = 30;
        if (ageOfMeryem == ageOfAhmet) {
            System.out.println("Meryem and Ahmet are the same age.");
        }

        if (ageOfMeryem > 40) {
            System.out.println("Meryem is older than 40.");
        }

        if (ageOfAhmet + ageOfMeryem > 60) {
            System.out.println("Meryem and Ahmet are older than 60.");
        }
    }
}
