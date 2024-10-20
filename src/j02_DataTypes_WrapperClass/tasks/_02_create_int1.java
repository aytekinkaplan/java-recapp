package j02_DataTypes_WrapperClass.tasks;

public class _02_create_int1 {

    public static void main(String[] args) {

        // Create an int with value 15 and print it
        int number = 15;
        System.out.println("First number: " + number);

        // Create another int with value 25 and print it
        int secondNumber = 25;
        System.out.println("Second number: " + secondNumber);

        // Create an int with value 40 and print the sum of all three numbers
        int thirdNumber = 40;
        int sum = number + secondNumber + thirdNumber;
        System.out.println("Sum: " + sum);

        // Create an int with value 50 and print the product of the third and fourth numbers
        int fourthNumber = 50;
        int product = thirdNumber * fourthNumber;
        System.out.println("Product: " + product);

        // Create a negative int and print it
        int negativeNumber = -10;
        System.out.println("Negative number: " + negativeNumber);
    }
}
