package com.codedifferently.coding.level.beginner.set30;

public class Problem {

    /*
       Again, we are looking for numbers that are within the range 10...20 inclusive.
       But this time we are looking for the max value within that range out of the 2 positive int values.

       Return the larger value that is in the range 10...20,
       or return 0 if neither number is in that range.

       larger1020(11, 19) --> 19
       larger1020(19, 11) --> 19
       larger1020(11, 9) --> 11
     */

    public static Integer larger1020(int a, int b) {

        if (a >= 10 && a <= 20){
            if (b >= 10 && b <= 20){
                return Math.max(a, b);
            }else{
                return a;
            }
            //return bigger
        }else if (b >= 10 && b <= 20){
            return b;
        }else{
            return 0;
        }
    }

}