package j09_Break_Continue;

public class C05_OCA_Type {

    public static void main(String[] args) {

        Raw_Loop:  // Define a label for the outer loop
        for (int row = 0; row < 5; row++) {  // Outer loop
            for (int col = 0; col < 5; col++) {  // Inner loop
                System.out.println(row * col);

                // Check if the product of row and col is even
                if (row * col % 2 == 0) {
                    continue Raw_Loop;  // Skip to the next iteration of the outer loop
                }

                // This line will print only if row*col is odd
                System.out.println(row * col);
            }
        }

        /*
        RAW_LOOP is a label that allows targeted control over loop flow.

        Explanation:
        - The program defines a labeled `Raw_Loop` to control the outer loop.
        - Inside the inner loop, if `row * col` is even, `continue Raw_Loop` skips the inner loop and returns to the next iteration of the outer loop.
        - If `row * col` is odd, the `continue` statement is bypassed, and `System.out.println(row * col)` in the inner loop will execute.

        Labels like `Raw_Loop` are helpful in nested loops, allowing control over specific loop levels when using `break` or `continue`.
        */
    }
}
