package com.codedifferently.coding.level.beginner.set06;

public class Problem {

    /*
    Johnny's favorite pharse to say is hi, he wants to know if the pharses given start with "hi".
    Provide Johnny with a string, and return true if the string starts with "hi" and false otherwise.

    beginWithHi("hi there") --> true
    beginWithHi("hi") --> true
    beginWithHi("hello hi") --> false
     */

    public static Boolean beginWithHi(String phrase) {

        String newPhrase = phrase.toLowerCase();
        return newPhrase.startsWith("hi");
    }
}