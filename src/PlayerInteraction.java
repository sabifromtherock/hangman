import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInteraction {
  private final Scanner scanner;
  private final ArrayList<Character> guessedLetters;
  private static int lives;

  public PlayerInteraction() {
    scanner = new Scanner(System.in);
    guessedLetters = new ArrayList<>();
    lives = 5;
  }

  public char captureGuess() {
    char guess = scanner.next().charAt(0);
    guessedLetters.add(guess);
    return guess;
  }

  public static int getLives() {
    return lives;
  }

  public void decreaseLives() {
    lives--;
  }

  public void closeScanner() {
    scanner.close();
  }
}
