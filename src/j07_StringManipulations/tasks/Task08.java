package j07_StringManipulations.tasks;

public class Task08 {
    public static void main(String[] args) {
        // TASK: Using the given String variable, print names on the console
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        // Example 1: Printing "AYTEKIN KAPLAN"
        StringBuilder name1 = new StringBuilder();
        name1.append(upperCaseLetters.charAt(0))  // A
                .append(upperCaseLetters.charAt(24)) // Y
                .append(upperCaseLetters.charAt(19)) // T
                .append(upperCaseLetters.charAt(4))  // E
                .append(upperCaseLetters.charAt(10)) // K
                .append(upperCaseLetters.charAt(8))  // I
                .append(upperCaseLetters.charAt(13)) // N
                .append(upperCaseLetters.charAt(26)) // Space
                .append(upperCaseLetters.charAt(10)) // K
                .append(upperCaseLetters.charAt(0))  // A
                .append(upperCaseLetters.charAt(15)) // P
                .append(upperCaseLetters.charAt(11)) // L
                .append(upperCaseLetters.charAt(0))  // A
                .append(upperCaseLetters.charAt(13)); // N

        System.out.println("Name 1: " + name1);

        // Example 2: Printing "JOHN DOE"
        StringBuilder name2 = new StringBuilder();
        name2.append(upperCaseLetters.charAt(9))  // J
                .append(upperCaseLetters.charAt(14)) // O
                .append(upperCaseLetters.charAt(7))  // H
                .append(upperCaseLetters.charAt(13)) // N
                .append(upperCaseLetters.charAt(26)) // Space
                .append(upperCaseLetters.charAt(3))  // D
                .append(upperCaseLetters.charAt(14)) // O
                .append(upperCaseLetters.charAt(4)); // E

        System.out.println("Name 2: " + name2);

        // Example 3: Printing "CHARLES"
        StringBuilder name3 = new StringBuilder();
        name3.append(upperCaseLetters.charAt(2))  // C
                .append(upperCaseLetters.charAt(7))  // H
                .append(upperCaseLetters.charAt(0))  // A
                .append(upperCaseLetters.charAt(17)) // R
                .append(upperCaseLetters.charAt(11)) // L
                .append(upperCaseLetters.charAt(4))  // E
                .append(upperCaseLetters.charAt(18)); // S

        System.out.println("Name 3: " + name3);
    }
}
