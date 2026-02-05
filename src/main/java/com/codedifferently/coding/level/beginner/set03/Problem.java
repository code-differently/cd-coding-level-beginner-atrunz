package com.codedifferently.coding.level.beginner.set03;

public class Problem {

    /* Problem 21
       We're on the lookout for values that contain the same last digit.
       You will be given two non-negative numbers to compare.
       Tip: Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
       Return true if both digits have the same last digit.
       Example:
       compareLastDigit(7, 17) --> true
       compareLastDigit(6, 17) --> false
       compareLastDigit(3, 113) --> true
     */

    public static Boolean compareLastDigit(int value1, int value2) {
        String value1S = String.valueOf(value1);
        String value2S = String.valueOf(value2);

        char value1Char = value1S.charAt(value1S.length()-1);
        char value2Char = value2S.charAt(value2S.length()-1);

        if (value1Char == value2Char){
            return true;
        }

        return false;
    }


    /* Problem 22
    A group of students is given an addition worksheet during class to compete against each other.
    The main goal is the find the sum of all the given values; you will be given a set of two numbers.
    The teacher decided to put a twist on the contest by providing one rule.
    Return the sum of two int values; but if the values are the same then return double their sum.
    Example:
    doubleTheSum(1, 2) --> 3
    doubleTheSum(3, 2) --> 5
    doubleTheSum(2, 2) --> 8
     */

    public static Integer doubleTheSum(int a, int b) {

        if (a == b){
            return 2*(a+b);
        }else{
            return a+b;
        }
    }


    /* Problem 23
    Tom's favorite number is ten, and he is on the look-out for the value 10 or the sum 10 out of the values given to him.
    Tom needs you to confirm if any of the values given have what he is looking for.
    Return true if one value is 10 or return true if the sum of both values is 10;
    Example:
    lookOut10(9, 10) --> true
    lookOut10(9, 9) --> false
    lookOut10(1, 9) --> true
     */

    public static Boolean lookOut10(int a, int b) {

        if (a == 10){
            return true;
        }else if (b==10){
            return true;
        }else if (a + b == 10){
            return true;
        }
        return false;
    }


    /* Problem 24
    Every string needs to begin with "not", in order to do that you need to add "not" to the beginning of a provided string.
    But if the string already begins with "not" we will leave it alone, no need to have a "not not".
    Return a new string where "not" has been added to the front.
    Tip: Use .equals() to compare 2 strings
    Example:
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


     /* Problem 25
       The most popular number today is 3. We need the first 3 characters of a string, and we need to make
       3 copies of those 3 characters. The front of a string is considered those 3 characters. The front can
       be less than 3, just need to provide whatever is there.
       Return a new string which is 3 copies of the front of the string.
       Example:
       popular3("Java") --> "JavJavJav"
       popular3("Chocolate") --> "ChoChoCho"
       popular3("abc") --> "abcabcabc"
     */

    public static String popular3(String front) {
        if (front.length() >= 4) {
            String firstThree = front.substring(0, 3);
            return firstThree+firstThree+firstThree;
        }else{
            return front+front+front;
        }
    }


     /* Problem 26
    With the provided string, we need you to provide a new scrambled string.
    Take the first two characters of the string or take whatever characters are present there.
    Return the new string with the first 2 characters added at both the front and back of the original string.
    Example:
    double22("kitten") --> "kikittenki"
    double22("Ha") --> "HaHaHa"
    double22("abc") --> "ababcab"
     */

    public static String double22(String word) {

        if (word.length()<2){
            return word + word + word;
        }else{
            String firstTwo = word.substring(0,2);
            return firstTwo + word + firstTwo;
        }
    }


     /* Problem 27
    We need to check if the given numbers are within the range 10...20 inclusive.
    You are given 2 int values, return true if either number is in the range of 10...20.
    Example:
    range1020(12, 99) --> true
    range1020(21, 12) --> true
    range1020(8, 99) --> false
     */

    public static Boolean range1020(int a, int b) {

        if (a >= 10 && a <= 20){
            return true;
        }else if (b >= 10 && b <= 20){
            return true;
        }else{
            return false;
        }
    }


    /* Problem 28
    Starting at index 1, we need to see if the word "del" appears.
    If "del" appears at that index then we need to delete the word "del".
    Return a new string where "del" has been deleted if appeared at index 1;
    return the string unchanged if "del" doesn't appear.
    Example:
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


    /* Problem 29
    Out of the given 3 int values, we need to find the max number.
    Return the largest int value out of the given 3.
    Example:
    maxNumber(1, 2, 3) --> 3
    maxNumber(1, 3, 2) --> 3
    maxNumber(3, 2, 1) --> 3
     */

    public static Integer maxNumber(int a, int b, int c) {

        int biggerNumberOne = Math.max(a, b);
        int biggerNumberTwo = Math.max(biggerNumberOne, c);
        return biggerNumberTwo;
    }


    /* Problem 30
       Again, we are looking for numbers that are within the range 10...20 inclusive.
       But this time we are looking for the max value within that range out of the 2 positive int values.
       Return the larger value that is in the range 10...20,
       or return 0 if neither number is in that range.
       Example:
       larger1020(11, 19) --> 19
       larger1020(19, 11) --> 19
       larger1020(11, 9) --> 11
     */

    public static Integer larger1020(int a, int b) {

        if (a >= 10 && a <= 20){
            if (b >= 10 && b <= 20){
                return Math.max(a, b);
            }else{
                return a;
            }
            //return bigger
        }else if (b >= 10 && b <= 20){
            return b;
        }else{
            return 0;
        }
    }


    /* Problem 31
      Create the string to look like it's going up; like a hill. To do this we need to take the last 3 characters
      and make them uppercase. Even if there's less than 3 characters, just make whatever is there uppercase.
      Doing this allows the string to look like it's going up and down depending on if begins with uppercase or not.
      Tip: str.toUpperCase() returns the uppercase version of a string
      Return a new string where the last 3 characters are now in upper case.
      Example:
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
