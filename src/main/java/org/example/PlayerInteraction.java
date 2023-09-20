package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInteraction {
  private final Scanner scanner;
  private final ArrayList<Character> guessedLetters;
  private int lives;

  public PlayerInteraction(int lives) {
    scanner = new Scanner(System.in);
    guessedLetters = new ArrayList<>();
    this.lives = lives;
  }

  public char captureGuess() {
    String input = scanner.next();
    char guess = input.charAt(0);
    if (input.length() != 1 || !Character.isLetter(guess)) {
      System.out.println("Invalid input. Please enter a single letter.");
      return captureGuess();
    }

    guessedLetters.add(guess);
    return guess;
  }

  public int getLives() {
    return lives;
  }

  public void decreaseLives() {
    lives--;
  }

  public void closeScanner() {
    scanner.close();
  }
}
