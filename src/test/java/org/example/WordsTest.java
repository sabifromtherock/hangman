package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void pass_test(){
        Words.getRandomWord();
        assertTrue(true);
    }
}