package com.codedifferently.coding.level.beginner.set25;

public class Problem {

    /*
       The most popular number today is 3. We need the first 3 characters of a string, and we need to make
       3 copies of those 3 characters. The front of a string is considered those 3 characters. The front can
       be less than 3, just need to provide whatever is there.

       Return a new string which is 3 copies of the front of the string.

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
}