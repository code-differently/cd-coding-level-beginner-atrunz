package com.codedifferently.coding.level.beginner.set29;

public class Problem {

    /*
    Out of the given 3 int values, we need to find the max number.

    Return the largest int value out of the given 3.

    maxNumber(1, 2, 3) --> 3
    maxNumber(1, 3, 2) --> 3
    maxNumber(3, 2, 1) --> 3
     */

    public static Integer maxNumber(int a, int b, int c) {

        int biggerNumberOne = Math.max(a, b);
        int biggerNumberTwo = Math.max(biggerNumberOne, c);
        return biggerNumberTwo;
    }
}