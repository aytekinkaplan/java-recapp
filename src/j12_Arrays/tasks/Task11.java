package j12_Arrays.tasks;

public class Task11 {
    public static void main(String[] args) {
        /*
         TASK:
         Create code to find and print the sum of numbers with the $ and £ symbols separately.
         Example String:
         String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";

        int dollarSum = 0;
        int poundSum = 0;

        // Split the string into individual elements
        String[] amounts = str.split(" ");

        // Iterate through each element and process based on the currency symbol
        for (String amount : amounts) {
            if (amount.startsWith("$")) {
                dollarSum += Integer.parseInt(amount.substring(1)); // Convert to int after removing $
            } else if (amount.startsWith("£")) {
                poundSum += Integer.parseInt(amount.substring(1)); // Convert to int after removing £
            }
        }

        System.out.println("Total in $: " + dollarSum);
        System.out.println("Total in £: " + poundSum);
    }
}
