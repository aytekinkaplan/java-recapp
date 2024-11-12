package j15_Varargs;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task:
        Create a method called `concat` that concatenates given strings.

        Examples:
        String[] arr1 = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};

        Input: {"m", "e", "r", "v", "e"}
        Output: "merve"

        Input: {"a", "l", "i"}
        Output: "ali"
         */

        String[] arr1 = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};

        // Testing the concat method with different inputs
        concat(arr1); // Output: merve
        concat(arr2); // Output: ali
        concat("java", "software", "development"); // Output: javasoftwaredevelopment
        concat("tester", "qa", "sdet", "scrum", "master"); // Output: testerqasdetscrummaster
    }

    // Method to concatenate multiple strings
    private static void concat(String... strings) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficiency
        for (String str : strings) {
            result.append(str);
        }
        System.out.println(result.toString());
    }
}
