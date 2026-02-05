package com.codedifferently.coding.level.beginner.set31;

public class Problem {

    /*
      Create the string to look like it's going up; like a hill. To do this we need to take the last 3 characters
      and make them uppercase. Even if there's less than 3 characters, just make whatever is there uppercase.
      Doing this allows the string to look like it's going up and down depending on if begins with uppercase or not.

      Tip: str.toUpperCase() returns the uppercase version of a string

      Return a new string where the last 3 characters are now in upper case.

      goingUp("Hello") --> "HeLLO"
      goingUp("hi there") --> "hi thERE"
      goingUp("hi") --> "HI"
     */

    public static String goingUp(String hill) {

        if (hill.length() < 4){
            return hill.toUpperCase();
        }
        String finalThreeLetters = hill.substring(hill.length()-3);
        return hill.substring(0, hill.length()-3) + (finalThreeLetters.toUpperCase());
    }
}