package j12_Arrays.tasks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Create a String like this: "$12 $23 $10 $2 $5 $2"
        Remove the dollar signs and sum the numbers.
        Print the total sum.
         */

        String str = "$12 $23 $10 $2 $5 $2";

        // Split the string into an array of strings without dollar signs
        String[] arr = str.split(" ");

        int sum = 0;
        for (String w : arr) {
            sum += Integer.parseInt(w.replace("$", "")); // Remove "$" and convert to integer, then add to sum
        }

        System.out.println("Total sum: " + sum);
    }
}
