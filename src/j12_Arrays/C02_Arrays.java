package j12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Checking for the presence of an array element
        // Check if the desired number exists in the array

        int[] numbers = {12, 13, 55, 66, 35, 3, 4, 34, 33, 63, 72};
        int desiredNumber = 35;

        int count = 0;
        boolean flag = false;

        // Loop to check if desired number is in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == desiredNumber) {
                count++;
                flag = true;
                break;
            }
        }

        // Using the count logic
        if (count >= 1) {
            System.out.println("Your number exists in our array: " + desiredNumber);
        } else {
            System.out.println("Your number is not in our array");
        }

        System.out.println("Occurrence of your number = " + count);

        // Using the flag logic
        if (flag) { // Executes if flag is true
            System.out.println("The number you want is in our array: " + desiredNumber);
        } else {
            System.out.println("The number you want is not in our array");
        }

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("numbers = " + numbers); // numbers = [I@79698539 (reference value)
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        // Arrays.toString(numbers) = [3, 4, 12, 13, 33, 34, 35, 55, 63, 66, 72]

        // Using binary search to find the index of the desired number
        System.out.println("Arrays.binarySearch(numbers, desiredNumber) = " +
                Arrays.binarySearch(numbers, desiredNumber)); // Arrays.binarySearch(numbers, desiredNumber) = 6
    }
}
