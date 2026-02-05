package com.codedifferently.coding.level.beginner.set22;

public class Problem {

    /*
    A group of students is given an addition worksheet during class to compete against each other.
    The main goal is the find the sum of all the given values; you will be given a set of two numbers.
    The teacher decided to put a twist on the contest by providing one rule.

    Return the sum of two int values; but if the values are the same then return double their sum.

    doubleTheSum(1, 2) --> 3
    doubleTheSum(3, 2) --> 5
    doubleTheSum(2, 2) --> 8
     */

    public static Integer doubleTheSum(int a, int b) {

        if (a == b){
            return 2*(a+b);
        }else{
            return a+b;
        }
    }
}