package com.codedifferently.coding.level.beginner.set20;

public class Problem {

    /*
       We are looking for numbers within two different ranges. You will be provided two numbers
       and need to see if they are both in the range of 30...40 inclusive or 40...50 inclusive.
       The numbers were looking for have to be within either one of those ranges.

       Return true if both numbers are in the range 30...40, or both numbers are in the range 40...50.

       range3050(30, 31) --> true
       range3050(30, 41) --> false
       range3050(40, 50) --> true
     */

    public static Boolean range3050(int one, int two) {

        if (Math.abs(one-two) > 10){
            return false;
        }else if ((one >= 30 && one <= 40) || (one >= 40 && one <= 50)){
            return true;
        }else{
            return false;
        }
    }
}