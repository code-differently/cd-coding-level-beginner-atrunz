package com.codedifferently.coding.level.beginner.set12;

public class Problem {

    /*
     It's a nice day, and you're at the park and see two dogs, bulldog and lab.
     The parameters bulldogGrowl and labGrowl indicates if each dog is growling.
     Surrounding people are in a bit of trouble if both dogs are growling or if neither are growling but are in a stare down.
     Return true if those people are in trouble.

     Example:

     dogTrouble(true, true) --> true

     dogTrouble(false, false) --> true

     dogTrouble(true, false) --> false
    */

    public static Boolean dogTrouble(boolean bulldogGrowl, boolean labGrowl) {

        if(bulldogGrowl && labGrowl){
            return true;
        }else if (!bulldogGrowl && !labGrowl){
            return true;
        }else{
            return false;
        }
    }
}