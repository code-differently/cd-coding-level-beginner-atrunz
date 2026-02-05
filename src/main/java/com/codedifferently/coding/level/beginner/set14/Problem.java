package com.codedifferently.coding.level.beginner.set14;

public class Problem {

    /*
    Looking at your math worksheet, your given 2 number values of either positive or negative.
    Evaluate a problem and find out if one of those numbers is positive and the other is negative.

    Return true if one is negative and one is positive.
    An exception to this is if the parameter "negative" is true, then only return true if both are negative.

    checkPosOrNeg(1, -1, false) --> true
    checkPosOrNeg(-1, 1, false) --> true
    checkPosOrNeg(-4, -5, true) --> true
     */

    public static Boolean checkPosOrNeg(int a, int b, boolean negative) {

        if (negative){
            if (a < 0 && b < 0){
                return true;
            }else{
                return false;
            }
        }else if (a < 0 && b < 0){
            return false;
        }else if (a < 0 || b < 0){
            return true;
        }else{
            return false;
        }
    }
}