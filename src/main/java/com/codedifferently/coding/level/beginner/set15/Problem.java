package com.codedifferently.coding.level.beginner.set15;

public class Problem {

    /*
    With the provided string, you need to exchange the first and last characters to create a new string.
    Return the new string.

    exchange("code") --> "eodc
    exchange("a") --> "a"
    exchange("ab") --> "ba"
     */

    public static String exchange(String str) {
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if (str.length() == 1) {
            return str;
        } else{
            String clipLetters = str.substring(1, str.length()-1);
            return last + clipLetters + first;
        }



    }
}