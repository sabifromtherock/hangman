import java.util.ArrayList;

public class Display {

  private String guessedWord;

  public String getGuessedWord() {
    return guessedWord;
  }

  public void displayCurrentState(String wordToGuess, ArrayList<Character> guessedLetters) {
    guessedWord = "";

    for (int i = 0; i < wordToGuess.length(); i++) {
      char letter = wordToGuess.charAt(i);
      char lowercaseLetter = Character.toLowerCase(letter);

      if (guessedLetters.contains(lowercaseLetter) || guessedLetters.contains(Character.toUpperCase(lowercaseLetter))) {
        guessedWord = guessedWord.concat(String.valueOf(letter));
        System.out.print(letter + " ");
      } else {
        guessedWord = guessedWord.concat("_");
        System.out.print("_ ");
      }
    }

    System.out.println();
  }
}
