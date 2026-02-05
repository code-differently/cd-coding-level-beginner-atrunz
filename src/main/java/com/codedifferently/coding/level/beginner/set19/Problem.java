package com.codedifferently.coding.level.beginner.set19;

public class Problem {

    /*
    We're on the look-out for ounces "oz" within a string. You will be given a string,
    and you need to determine if the first two characters yields "oz".
    We need you to return a new string made of the first 2 chars (if present).

    Only include first char if it is 'o' and only include second char if it is 'z'.

    beginWithOz("ozymandias") --> "oz"
    beginWithOz("bzoo") --> "z"
    beginWithOz("oxx") --> "o"
     */

    public static String beginWithOz(String ounces) {
        String firstChar = ounces.substring(0, 1);
        String secondChar = ounces.substring(1, 2);
        String newChar = "";
        if (firstChar.equals("o")){
            newChar=newChar+firstChar;
        }
        if (secondChar.equals("z")) {
            newChar = newChar+secondChar;
        }
        return newChar;

    }

}