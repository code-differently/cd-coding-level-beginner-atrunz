package com.codedifferently.coding.level.beginner.set08;

public class Problem {

    /*
    Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
    But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
    He needs your help to make sure the list of given phrases begin with what was asked.

    Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"

    startWithIx("mix snacks") --> true
    startWithIx("pix snacks") --> true
    startWithIx("piz snacks") --> false

     */

    public static Boolean startWithIx(String phrase) {

        String shortPhrase = phrase.substring(1,3);
        return shortPhrase.equalsIgnoreCase("ix");
    }
}