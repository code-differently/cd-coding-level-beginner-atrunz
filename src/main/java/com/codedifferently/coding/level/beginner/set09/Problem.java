package com.codedifferently.coding.level.beginner.set09;

public class Problem {

    /*
    Provide two numbers, evalute both numbers to see which one is nearest to the value 10.
    Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
    In that case, we would consider that event a tie.

    Tip: Math.abs(n) returns the absolute value of a number

    Return whichever number is nearest to 10, or return 0 for the event of a tie.

    near10(8, 13) --> 8
    near10(13, 8) --> 8
    near10(13, 7) --> 0

     */

    public static Integer near10(int one, int two) {
        int distance1 = Math.abs(one - 10);
        int distance2 = Math.abs(two - 10);

        if (distance2 > distance1) {
            return one;
        } else if (distance1 == distance2) {
            return 0;
        } else {
            return two;
        }
    }
}