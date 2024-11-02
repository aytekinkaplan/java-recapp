package j12_Arrays.tasks;

public class Task17 {
    public static void main(String[] args) {
        // Task: Print the largest element in the multi-dimensional array "sayi"

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int max = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

        // Loop through each subarray and each element within the sub-array
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                // Update max if the current element is greater than max
                if (sayi[i][j] > max) {
                    max = sayi[i][j];
                }
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
