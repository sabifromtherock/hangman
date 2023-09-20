package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Display display = new Display();
    Scanner scanner = new Scanner(System.in);

    String wordToGuess = Words.getRandomWord();
    ArrayList<Character> guessedLetters = new ArrayList<>();

    System.out.println("Let's play Hangman!");
    System.out.println("Choose a difficulty level: \n(1) Easy, \n(2) Medium, \n(3) Hard");

    int choice;

    while (true) {
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        break;
      } else {
        System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
        scanner.next();
      }
    }

    PlayerInteraction playerInteraction;

    switch (choice) {
      case 1:
        playerInteraction = new EasyGame();
        System.out.println("You have " + playerInteraction.getLives() + " lives.");
        break;
      case 2:
        playerInteraction = new MediumGame();
        System.out.println("You have " + playerInteraction.getLives() + " lives.");
        break;
      case 3:
        playerInteraction = new HardGame();
        System.out.println("You have " + playerInteraction.getLives() + " lives.");
        break;
      default:
        System.out.println("Invalid choice. Defaulting to Hard.");
        playerInteraction = new HardGame();
        System.out.println("You have " + playerInteraction.getLives() + " lives.");
        break;
    }

    System.out.println();
    display.displayCurrentState(wordToGuess, guessedLetters);

    System.out.println();
    System.out.println("Guess a letter: ");

    char guess;

    while (playerInteraction.getLives() > 0 && !display.getGuessedWord().equals(wordToGuess)) {
      guess = Character.toLowerCase(playerInteraction.captureGuess());

      if (guessedLetters.contains(guess)) {
        System.out.println("You've typed letter '" + guess + "' before.\nTry another letter:");
        continue;
      }

      if (wordToGuess.contains(Character.toString(guess))) {
        System.out.println("Correct guess. Remaining lives: " + playerInteraction.getLives());
      } else {
        playerInteraction.decreaseLives();
        System.out.println("Incorrect guess. Remaining lives: " + playerInteraction.getLives());
      }

      guessedLetters.add(guess);
      Collections.sort(guessedLetters);

      System.out.print("Guessed letters so far: ");
      for (char letter : guessedLetters) {
        System.out.print(letter + ", ");
      }
      System.out.println();

      display.displayCurrentState(wordToGuess, guessedLetters);
      System.out.println("\nGuess another letter: ");
    }

    if (playerInteraction.getLives() == 0) {
      System.out.println("\nYou've run out of lives.\nThe word was: " + wordToGuess);
    } else {
      System.out.println("\nCongratulations! You've guessed the word: " + wordToGuess);
    }

    playerInteraction.closeScanner();
    scanner.close();
  }
}
