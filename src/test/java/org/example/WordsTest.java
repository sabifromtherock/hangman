package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {

    @Test
    @DisplayName("getRandomWord() returns a string")
    public void getRandomWord_SingleCall_ReturnsNotEmptyString() {
        String randomWord = Words.getRandomWord();

        assertFalse(randomWord.isEmpty());
    }

    @Test
    @DisplayName("getRandomWord() returns different words when called multiple times")
    public void getRandomWord_MultipleCalls_ReturnsDifferentWords() {
        String randomWord1 = Words.getRandomWord();
        String randomWord2 = Words.getRandomWord();

        assertNotEquals(randomWord1, randomWord2);
    }
}
