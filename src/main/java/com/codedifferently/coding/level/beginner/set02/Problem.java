package com.codedifferently.coding.level.beginner.set02;

public class Problem {

    /* Problem 11
    An elementary school teacher needs your help to create new strings for a fun activity they have planned.
     You will be provided a non-empty string and a number N. To create a new string, you will start with the character 0.
     Next you will add every Nth character of the string to the new string.

     Return the new string.

     Tip: If N is 3, use char 0, 3, 6 ... and so on. N is 1 or more.

     Example:
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

    /* Problem 12
     It's a nice day, and you're at the park and see two dogs, bulldog and lab.
     The parameters bulldogGrowl and labGrowl indicates if each dog is growling.
     Surrounding people are in a bit of trouble if both dogs are growling or if neither are growling but are in a stare down.

     Return true if those people are in trouble.

     Example:
     dogTrouble(true, true) --> true
     dogTrouble(false, false) --> true
     dogTrouble(true, false) --> false
    */

    public static Boolean dogTrouble(boolean bulldogGrowl, boolean labGrowl) {

        if(bulldogGrowl && labGrowl){
            return true;
        }else if (!bulldogGrowl && !labGrowl){
            return true;
        }else{
            return false;
        }
    }

    /* Problem 13
    We have a loud crying puppy in an apartment building. The "hour" parameter is the current hour time
     in the range 0...23. We will get in trouble if the puppy is crying and the time is before 7 or after 20.

     Return true if we will get in trouble based on if the puppy is crying during a specfic time of day.

     Example:
     puppyCry(true, 6) --> true
     puppyCry(true, 7) --> false
     puppyCry(false, 6) --> false
     */

    public static Boolean puppyCry(boolean crying, int hour) {

        if (hour < 7){
            if (crying){
                return true;
            }else{
                return false;
            }
        }else if (hour > 20){
            if (crying){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }

    }


    /* Problem 14
    Looking at your math worksheet, your given 2 number values of either positive or negative.
    Evaluate a problem and find out if one of those numbers is positive and the other is negative.

    Return true if one is negative and one is positive.

    An exception to this is if the parameter "negative" is true, then only return true if both are negative.

    Example:
    checkPosOrNeg(1, -1, false) --> true
    checkPosOrNeg(-1, 1, false) --> true
    checkPosOrNeg(-4, -5, true) --> true
     */

    public static Boolean checkPosOrNeg(int a, int b, boolean negative) {

        if (negative){
            if (a < 0 && b < 0){
                return true;
            }else{
                return false;
            }
        }else if (a < 0 && b < 0){
            return false;
        }else if (a < 0 || b < 0){
            return true;
        }else{
            return false;
        }
    }


    /* Problem 15
    With the provided string, you need to exchange the first and last characters to create a new string.

    Return the new string.

    Example:
    exchange("code") --> "eodc
    exchange("a") --> "a"
    exchange("ab") --> "ba"
     */

    public static String exchange(String str) {
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if (str.length() == 1) {
            return str;
        } else{
            String clipLetters = str.substring(1, str.length()-1);
            return last + clipLetters + first;
        }



    }


     /* Problem 16
    We are looking to write down a list of all possible numbers that can be a
    multiple of 3 or 5.
    You will be given any number, but to be put on the list the number has to be a non-negative number.

    Return true if the given number can be added to the list.

    Tip: Think about using the % "mod" operator

    Example:
    multipleOf(3) --> true
    multipleOf(10) --> true
    multipleOf(8) --> false
     */

    public static Boolean multipleOf(int number){

        if (number < 0){
            return false;
        }else if (number % 3 == 0 || number % 5 == 0){
            return true;
        }else{
            return false;
        }
    }


    /* Problem 17
       You are given two random temperatures from different states.
       Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
       Both of these statements need to be true to prove that some states have extreme cases of temperatures.

       Return true, if one temp is less than 0 and the other is greater than 100.

       Example:
       checkTemp(120, -1) --> true
       checkTemp(-1, 120) --> true
       checkTemp(2, 120) --> false
     */

    public static Boolean checkTemp(int temp1, int temp2) {

        if (temp1 < 0){
            return temp2 > 100;
        }else if (temp2 < 0){
            return temp1 > 100;
        }else{
            return false;
        }
    }


     /* Problem 18
      An upcoming artist's concert is coming to town.
      The concert manager is only allowing one person of a pair to be a "teen".
      Your at the front gate checking tickets and verifying ages.
      You allowed to let a pair in as long as only one person is a teen but both can't be a "teen".
      A "teen" is considered someone within the range of 13...19 inclusive.

      Return true if one or the other person in the pair is a teen, but not both.

      Example:
      oneTeen(13, 99) --> true
      oneTeen(21, 19) --> true
      oneTeen(13, 13) --> false
     */

    public static Boolean oneTeen(int person1, int person2) {

        boolean teen1 = (person1 >= 13 && person1 <=19);
        boolean teen2 = (person2 >= 13 && person2 <=19);
        if (teen1 && teen2 || !teen1 && !teen2){
            return false;
        }else{
            return true;
        }

    }


    /* Problem 19
    We're on the look-out for ounces "oz" within a string. You will be given a string,
    and you need to determine if the first two characters yields "oz".
    We need you to return a new string made of the first 2 chars (if present).

    Only include first char if it is 'o' and only include second char if it is 'z'.

    Example:
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


    /* Problem 20
       We are looking for numbers within two different ranges. You will be provided two numbers
       and need to see if they are both in the range of 30...40 inclusive or 40...50 inclusive.
       The numbers were looking for have to be within either one of those ranges.

       Return true if both numbers are in the range 30...40, or both numbers are in the range 40...50.

       Example:
       range3050(30, 31) --> true
       range3050(30, 41) --> false
       range3050(40, 50) --> true
     */

    public static Boolean range3050(int one, int two) {

        if (Math.abs(one-two) > 10){
            return false;
        }else if ((one >= 30 && one <= 40) || (one >= 40 && one <= 50)){
            return true;
        }else{
            return false;
        }
    }
}
