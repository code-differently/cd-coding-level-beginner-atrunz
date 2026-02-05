package com.codedifferently.coding.level.beginner.set11;

public class Problem {

    /*
    An elementary school teacher needs your help to create new strings for a fun activity they have planned.
     You will be provided a non-empty string and a number N. To create a new string, you will start with the character 0.
     Next you will add every Nth character of the string to the new string. Return the new string.

     Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

     everyOther("Miracle", 2) --> "Mrce"
     everyOther("abcdefg", 2) --> "aceg"
     everyOther("abcdefg", 3) --> "adg"
     */

    public static String everyOther(String str, int n) {

        int index = 0;

        String newString = "";


        while (index < str.length()-n) {
            newString = newString + str.charAt(index);
            index = index + n;
        }
        return newString;
    }
}