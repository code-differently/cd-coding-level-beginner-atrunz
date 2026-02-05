package com.codedifferently.coding.level.beginner.set27;

public class Problem {

    /*
    We need to check if the given numbers are within the range 10...20 inclusive.
    You are given 2 int values, return true if either number is in the range of 10...20.

    range1020(12, 99) --> true
    range1020(21, 12) --> true
    range1020(8, 99) --> false
     */

    public static Boolean range1020(int a, int b) {

        if (a >= 10 && a <= 20){
            return true;
        }else if (b >= 10 && b <= 20){
            return true;
        }else{
            return false;
        }
    }
}