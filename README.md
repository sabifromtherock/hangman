# Hangman Game

## Overview

This Hangman Game is a simple Java console-based game where the player needs to guess a random word. The game offers three different difficulty levels, each with a different number of lives:

- EasyGame: 8 lives
- MediumGame: 5 lives
- HardGame: 3 lives

The player interacts with the game using the `Scanner` class to input their guesses. The objective is to guess the word without running out of lives.

## How to Play

1. Clone or download the repository to your local machine.

   ```
   git clone https://github.com/sabifromtherock/hangman.git
   ```

2. Run the game by running the `main` method in the `Main` class.

3. Choose a difficulty level:

    - (1) Easy
    - (2) Medium
    - (3) Hard

4. Start guessing letters one by one. The game will inform you if your guess is correct or incorrect, and it will display your progress.

5. Keep guessing until you either:

    - Successfully guess the word.
    - Run out of lives.

6. The game will display whether you won or lost and reveal the word.

## Features

- Three difficulty levels with different lives.
- Randomly selected words for each game.
- Input validation to ensure you enter only valid options.
- Alerts for repeated guesses.
- A visual representation of the current state of the word.
