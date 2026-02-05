package com.codedifferently.coding.level.beginner.set26;

public class Problem {

    /*
    With the provided string, we need you to provide a new scrambled string.
    Take the first two characters of the string or take whatever characters are present there.

    Return the new string with the first 2 characters added at both the front and back of the original string.

    double22("kitten") --> "kikittenki"
    double22("Ha") --> "HaHaHa"
    double22("abc") --> "ababcab"
     */

    public static String double22(String word) {

        if (word.length()<2){
            return word + word + word;
        }else{
            String firstTwo = word.substring(0,2);
            return firstTwo + word + firstTwo;
        }
    }
}