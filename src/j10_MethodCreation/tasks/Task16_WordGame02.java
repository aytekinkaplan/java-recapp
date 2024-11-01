package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task16_WordGame02 {
    static Scanner scan = new Scanner(System.in);
    static String wordToAdd;
    static String word = "";
    static int turn = 1;
    static int score1;
    static int score2;

    public static void main(String[] args) {
        startGame();
    }

    public static void playGame() {
        scan.nextLine();
        System.out.println();
        System.out.print(turn + ". Player chose to continue! Please enter the word you want to add: ");
        wordToAdd = scan.nextLine().toUpperCase().trim();
        addToBeginningOrEnd();
        System.out.println();
        System.out.println("Current word: " + word);
        acceptOrReject();
    }

    public static void addToBeginningOrEnd() {
        System.out.println();
        System.out.println("Do you want to add the word at the beginning or end? \nEnter 1 for BEGINNING \nEnter 2 for END");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                word = wordToAdd + word;
                break;
            case 2:
                word += wordToAdd;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                addToBeginningOrEnd();
        }
    }

    public static void startGame() {
        System.out.println();
        System.out.println("-------Welcome to the Word Game!-------");
        System.out.println();
        System.out.print("Player " + turn + " starts the game. Please enter the initial word: ");
        wordToAdd = scan.nextLine().trim().toUpperCase();
        System.out.println();
        System.out.println("Entered word: " + wordToAdd);
        word = wordToAdd;
        acceptOrReject();
    }

    public static void acceptOrReject() {
        System.out.println();
        System.out.print("Player " + (turn == 1 ? 2 : 1) + ", do you accept the word entered by player " + (turn == 1 ? 1 : 2) + "? Enter 1 for YES or 2 for NO: ");
        int decision = scan.nextInt();
        if (decision == 1) {
            System.out.println("Player " + (turn == 1 ? 2 : 1) + " accepted the word...");
            if (turn == 1)
                score1 += wordToAdd.length();
            else
                score2 += wordToAdd.length();
            displayScores();
            turn = turn == 1 ? 2 : 1;
            continueOrEnd();
        } else if (decision == 2) {
            System.out.println("Invalid word! Player " + (turn == 1 ? 2 : 1) + " rejected the word :(");
            turn = turn == 1 ? 2 : 1;
            gameOver();
        } else {
            System.out.println("Invalid choice, please enter 1 or 2.");
            acceptOrReject();
        }
    }

    public static void continueOrEnd() {
        System.out.println();
        System.out.print("It's player " + turn + "'s turn. Enter 1 to continue or 2 to end the game: ");
        int decision = scan.nextInt();
        switch (decision) {
            case 1:
                playGame();
                break;
            case 2:
                endGame();
                break;
            default:
                System.out.println("Invalid input! Please try again.");
                continueOrEnd();
        }
    }

    public static void endGame() {
        System.out.println();
        System.out.println("Player " + turn + " decided to end the game :)");
        displayScores();
        System.out.println((score1 == score2) ? "The game is a tie! Friendship wins!" : score1 > score2 ? "Player 1 wins!" : "Player 2 wins!");
        System.out.println("Thank you for playing, come again! :)");
    }

    public static void gameOver() {
        System.out.println();
        System.out.println("Unfortunately, the game is over.");
        System.out.println();
        System.out.println("The winner is player " + turn);
    }

    public static void displayScores() {
        System.out.println();
        System.out.println("-------SCOREBOARD-------");
        System.out.println();
        System.out.println("Player 1 score: " + score1);
        System.out.println("Player 2 score: " + score2);
        System.out.println();
    }
}
