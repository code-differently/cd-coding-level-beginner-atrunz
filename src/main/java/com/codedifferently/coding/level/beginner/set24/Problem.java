package com.codedifferently.coding.level.beginner.set24;

public class Problem {

    /*
    Every string needs to begin with "not", in order to do that you need to add "not" to the beginning of a provided string.
    But if the string already begins with "not" we will leave it alone, no need to have a "not not".

    Return a new string where "not" has been added to the front.

    Tip: Use .equals() to compare 2 strings

    beginWithNot("candy") --> "not candy"
    beginWithNot("x") --> "not x"
    beginWithNot("not bad") --> "not bad"
     */

    public static String beginWithNot(String not) {

        if (not.startsWith("not")){
            return not;
        }else{
            return "not " + not;
        }
    }
}