package com.codedifferently.coding.level.beginner.set07;

public class Problem {

     /*
    If you think of the basic numbers 0-20, you will notice that 13-19 contain the word "teen" in them.
    The math instructor provides you with 3 numbers, you need to decided if 1 or more of them contain teen.

    Return true if 1 or more of them contain teen.

    containTeen(13, 20, 10) --> true
    containTeen(20, 19, 10) --> true
    containTeen(20, 10, 13) --> true
     */

    public static Boolean containTeen(int one, int two, int three){

        if ((one-10) > 0 && (one-10) < 10){
            return true;
        }else if((two-10) > 0 && (two-10) < 10) {
            return true;
        } else if ((three-10) > 0 && (three-10) < 10) {
            return true;
        }else{
            return false;
        }
    }
}