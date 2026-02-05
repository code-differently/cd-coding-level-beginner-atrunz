package com.codedifferently.coding.level.beginner.set05;

public class Problem {

    /*
    Given the word of the day, take the last letter and
    return a new word of the day when you add the last letter to the front and back of the word.

    For example, "founder" yields "rfounderr".

    Tip: The word of the day will be a length 1 or more

    wordOfDay("cat") --> "tcatt"
    wordOfDay("Hello" --> "oHelloo"
    wordOfDay("a") --> "aaa"
     */

    public static String wordOfDay(String word) {
        int finalIndex = word.length()-1;
        char lastLetter = word.charAt(finalIndex);
        String newString = lastLetter + word + lastLetter;
        return newString;
    }
}