package com.codedifferently.coding.level.beginner.set18;

public class Problem {

    /*
      An upcoming artist's concert is coming to town.
      The concert manager is only allowing one person of a pair to be a "teen".
      Your at the front gate checking tickets and verifying ages.
      You allowed to let a pair in as long as only one person is a teen but both can't be a "teen".

      A "teen" is considered someone within the range of 13...19 inclusive.

      Return true if one or the other person in the pair is a teen, but not both.

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

}