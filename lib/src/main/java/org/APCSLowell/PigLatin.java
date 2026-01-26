package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
      for (int i = 0; i < sWord.length(); i++) {
    String letter = sWord.substring(i, i + 1);
    if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") ||
        letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")) {
        return i;
    }
}
        return -1;
    }

    public String pigLatin(String sWord) {
    if (sWord.length() == 0) {
    return sWord;
}

// Get the first letter
String firstLetter = sWord.substring(0, 1);

// Words that begin with a vowel
if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o") || firstLetter.equals("u") ||
    firstLetter.equals("A") || firstLetter.equals("E") || firstLetter.equals("I") || firstLetter.equals("O") || firstLetter.equals("U")) {
    return sWord + "way";
}

// Words that begin with "qu" or "Qu" or "QU"
if (sWord.length() > 1) {
    String firstTwo = sWord.substring(0, 2);
    if (firstTwo.equals("qu") || firstTwo.equals("Qu") || firstTwo.equals("qU") || firstTwo.equals("QU")) {
        return sWord.substring(2) + firstTwo + "ay";
    }
}

// Words that are all consonants or begin with consonants
int firstVowelIndex = findFirstVowel(sWord);
if (firstVowelIndex == -1) {
    return sWord + "ay"; // all consonants
} else {
    return sWord.substring(firstVowelIndex) + sWord.substring(0, firstVowelIndex) + "ay";
}

    }
}
