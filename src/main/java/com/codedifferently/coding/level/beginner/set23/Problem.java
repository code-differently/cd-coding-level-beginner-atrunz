package com.codedifferently.coding.level.beginner.set23;

public class Problem {

    /*
    Tom's favorite number is ten, and he is on the look-out for the value 10 or the sum 10 out of the values given to him.
    Tom needs you to confirm if any of the values given have what he is looking for.

    Return true if one value is 10 or return true if the sum of both values is 10;

    lookOut10(9, 10) --> true
    lookOut10(9, 9) --> false
    lookOut10(1, 9) --> true
     */

    public static Boolean lookOut10(int a, int b) {

        if (a == 10){
            return true;
        }else if (b==10){
            return true;
        }else if (a + b == 10){
            return true;
        }
        return false;
    }
}