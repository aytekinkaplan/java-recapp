package j01_Variables.tasks;

public class Task01 {
    /*
        Java Escape Special Characters:
        \n : Starts a new line.
        \t : Horizontal tab (adds indentation).
        \\ : Prints a backslash "\".
        \' : Prints a single quote "'".
        \" : Prints a double quote """.
     */

    public static void main(String[] args) {
    // Question-1: Print "Hello ", "World  \ /" on the console as shown.

    System.out.println("   \"Hello \", \"World \\ /\"    ");

    // Question-2: Print the word "Monday" with each letter on a new line.
    System.out.println("M\no\nn\nd\na\ny");

    // Question-3: Print the sentence "Java" is very 'stylish'.
    System.out.println("\"Java\" is very \'stylish\'");

    // Question-4: Print the sentence "Success" loves 'effort'
    // Followed by "Learning Java with Clarusway is easy..." printed 3 lines later, indented with a tab.
    System.out.println("\"Success\" loves \n\'effort\' \n\n\n\t\"Learning Java with Clarusway is easy...\"");
}
}
