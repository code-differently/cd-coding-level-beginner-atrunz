package com.codedifferently.coding.level.beginner.set04;

public class Problem {

    /*
    The instructor provided you with a non-empty string and a number n.
    The instructor wants you to remove the letter at index n and provide a new string.
    Tip: Value of n should be a valid index of a given letter in the original string,
    such as 0 or str.length()-1 inclusive
    missingLetter("kitten", 1) --> "ktten"
    missingLetter("kitten", 0) --> "itten"
    missingLetter("kitten", 4) --> "kittn"
     */

    public static String missingLetter(String letter, int n) {

        String newStringFirst = letter.substring(0, n);
        if (n != letter.length()-1) {
            String newStringLast = letter.substring(n+1);
            return newStringFirst + newStringLast;
        }else{
            return newStringFirst;
        }

    }
}
