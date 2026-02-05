package com.codedifferently.coding.level.beginner.set10;

public class Problem {

    /*
    Determine if the given string contains between 1 and 3 'e' characters.

    Only if the string contains between 1 and 3 'e' characters; return true.

    containE("Hello") --> true
    containE("Heelle") --> true
    containE("Heelele") --> false
     */

    public static Boolean containE(String str) {
        //int lastIndex = str.lastIndexOf('e');

        //int secondLastIndex = str.lastIndexOf('e', lastIndex-1);
        int firstIndex = str.indexOf('e');
        int secondIndex = str.indexOf('e', firstIndex+1);
        int thirdIndex = str.indexOf('e', secondIndex+1);
        int fourthIndex = str.indexOf('e', thirdIndex+1);

        if (fourthIndex != -1){
            return false;
        } else return firstIndex != -1 || secondIndex != -1 || thirdIndex != -1;

    }
}