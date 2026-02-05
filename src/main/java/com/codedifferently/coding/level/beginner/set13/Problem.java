package com.codedifferently.coding.level.beginner.set13;

public class Problem {

    /*
    We have a loud crying puppy in an apartment building. The "hour" parameter is the current hour time
     in the range 0...23. We will get in trouble if the puppy is crying and the time is before 7 or after 20.

     Return true if we will get in trouble based on if the puppy is crying during a specfic time of day.

     puppyCry(true, 6) --> true
     puppyCry(true, 7) --> false
     puppyCry(false, 6) --> false
     */

    public static Boolean puppyCry(boolean crying, int hour) {

        if (hour < 7){
            if (crying){
                return true;
            }else{
                return false;
            }
        }else if (hour > 20){
            if (crying){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }

    }
}