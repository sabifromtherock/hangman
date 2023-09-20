package org.example;

import java.util.Random;

public class Words {
  private static final String[] WORDS = {
          "airplane", "apple", "banana", "broccoli", "caterpillar",
          "chocolate", "crocodile", "dolphin", "elevator", "elephant", "flamingo",
          "football", "giraffe", "guitar", "hamburger", "internet",
          "island", "jazz", "jellyfish", "kangaroo", "koala",
          "laptop", "leopard", "microphone", "mountain", "nightmare",
          "notebook", "ocean", "octopus", "palm", "penguin", "raspberry",
          "restaurant", "rhinoceros", "strawberry", "sunflower",
          "television", "tennis", "tiger", "umbrella", "unicorn", "vampire",
          "volcano", "waterfall", "watermelon",
          "yacht", "yeti", "zebra"
  };

  public static String getRandomWord() {
    Random random = new Random();
    int index = random.nextInt(WORDS.length);
    return WORDS[index];
  }
}
