package com.codedifferently.coding.level.beginner.set21;

public class Problem {

    /*
       We're on the lookout for values that contain the same last digit.
       You will be given two non-negative numbers to compare.

       Tip: Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

       Return true if both digits have the same last digit.

       compareLastDigit(7, 17) --> true
       compareLastDigit(6, 17) --> false
       compareLastDigit(3, 113) --> true
     */

    public static Boolean compareLastDigit(int value1, int value2) {
        String value1S = String.valueOf(value1);
        String value2S = String.valueOf(value2);

        char value1Char = value1S.charAt(value1S.length()-1);
        char value2Char = value2S.charAt(value2S.length()-1);

        if (value1Char == value2Char){
            return true;
        }

        return false;
    }
}