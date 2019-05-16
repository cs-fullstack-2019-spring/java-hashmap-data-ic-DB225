package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ex4();
    }


    //    Prompt the User for secret word. Create a while loop that will continually ask the Player to guess
    //    the secret word until it’s correct, or 5 wrong guesses have been made. Once it’s correct print THAT’S CORRECT!!!
    //    and also how many guesses it took to get it right. If the Player doesn't get the secret word after 5 tries,
    //    end the program and print Sorry! Out of guesses :-(
    private static void ex4() {
        boolean rightAnswer = false;
        Scanner reader = new Scanner(System.in);
        int guesses = 5; // 5 guesses
        System.out.print("Enter a secret word for the game: ");
        String secretWord = reader.nextLine().trim();
        do {
            System.out.print("Enter your guess: ");
            // Check if correct answer. Use String.trim() and String.equalsIgnoreCase() to ignore case and remove any blanks
            if ((reader.nextLine().trim().equalsIgnoreCase(secretWord))) {
                // Answer matched
                rightAnswer = true;
                ;
            } else {
                System.out.println("Wrong... try again!!");
                guesses--; // Subtract a guess
            }

        } while (guesses > 0 && !rightAnswer); // Keep asking until they give right answer


        if (rightAnswer) {
            System.out.println("THAT’S CORRECT!!!\nYou guessed the secret word in " + (5 - guesses) + " guesses!");
        } else // GAME OVER MAN
        {
            System.out.println("GAME OVER MAN\nSorry, you didn't guess the secret word :-(");
        }

    }
}
