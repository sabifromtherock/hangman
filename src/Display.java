import java.util.ArrayList;

public class Display {
  public static void displayCurrentState(String wordToGuess, ArrayList<Character> guessedLetters) {

    for (int i = 0; i < wordToGuess.length(); i++) {
      char letter = wordToGuess.charAt(i);
      char lowercaseLetter = Character.toLowerCase(letter);

      if (guessedLetters.contains(lowercaseLetter) || guessedLetters.contains(Character.toUpperCase(lowercaseLetter))) {
        System.out.print(letter + " ");
      } else {
        System.out.print("_ ");
      }
    }

    System.out.println();
  }
}
