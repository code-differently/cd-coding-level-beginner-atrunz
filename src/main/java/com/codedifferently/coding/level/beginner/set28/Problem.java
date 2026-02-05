package com.codedifferently.coding.level.beginner.set28;

public class Problem {

    /*
    Starting at index 1, we need to see if the word "del" appears.
    If "del" appears at that index then we need to delete the word "del".

    Return a new string where "del" has been deleted if appeared at index 1;
    return the string unchanged if "del" doesn't appear.

    deleteDel("adelbc") --> "abc"
    deleteDel("adelHello") --> "aHello"
    deleteDel("adedbc") --> "adedbc"
     */

    public static String deleteDel(String del) {
        if (del.startsWith("del", 1)){
            return del.charAt(0) + del.substring(4);
        }else{
            return del;
        }
    }
}