package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task16_WordGame01 {
    // Declaring the scanner and variables at the class level to use in multiple methods
    static int player = 1; // Start with player 1, and switch to player 2 when needed
    static int score1 = 0;
    static int score2 = 0;
    static String word = "";
    static String addition = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * A word game for two players
         * Rules:
         * 1- Initially, ask the first player to enter a word and display it.
         *
         * 2- Once player 1 enters a word, ask player 2 if they accept it.
         *    - If player 2 accepts, add the length of the word as points to player 1 and proceed to step 3.
         *    - If player 2 rejects the word, display "Invalid word" and declare player 1 as the winner, then end the game.
         *
         * 3- Ask the new player if they want to continue playing.
         *    - If they do, ask for a string to add to the word and whether to add it at the beginning or the end.
         *      Add the chosen string to the word and return to step 2.
         *    - If they don’t want to continue, display "Game Over", print both players' scores, and declare the winner.
         */

        System.out.print(player + ". player, please enter a word to start: ");
        word = scan.next(); // Assign the input word to the 'word' variable

        // Switch to the next player for acceptance check
        switchPlayer();

        askForApproval();
    }

    public static void askForApproval() {
        System.out.println("Current word: " + word);
        System.out.println(player + ". player, do you accept the entered word? \n1: Yes \n0: No");

        int approval = scan.nextInt();
        if (approval == 1) {   // Option 1 means the player accepts the word

            if (player == 1) { // If it's player 1's turn, add points to player 2
                score2 += word.length(); // Add the length of the word to player 2's score
            } else {
                score1 += word.length(); // Otherwise, add the length to player 1's score
            }
            askToContinue();

        } else endGame(); // Option 0 means the player rejects the word
    }

    private static void askToContinue() {
        System.out.println("Do you want to continue the game? \n1: Yes \n0: No");
        int choice = scan.nextInt();
        if (choice == 1) { // Option 1 to continue the game
            addToWord();
        } else {
            System.out.println("Game Over");
            System.out.println("Player 1 score: " + score1);
            System.out.println("Player 2 score: " + score2);
            if (score1 > score2) {
                System.out.println("Player 1 wins!");
            } else if (score2 > score1) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("The game ended in a tie.");
            }
        }
    }

    public static void addToWord() {
        System.out.print("Enter a word to add to the current word: ");
        addition = scan.next();
        System.out.println("Do you want to add the new word at the beginning or the end? \n1: Beginning \n0: End");
        int choice = scan.nextInt();
        if (choice == 1) {
            word = addition + word; // Add to the beginning
        } else {
            word = word + addition; // Add to the end
        }
        switchPlayer();
        askForApproval();
    }

    private static void endGame() {
        System.out.println("Player " + player + " wins because the other player entered an invalid word.");
    }

    public static void switchPlayer() {
        if (player == 1) {
            player = 2;
        } else {
            player = 1;
        }
    }
}
