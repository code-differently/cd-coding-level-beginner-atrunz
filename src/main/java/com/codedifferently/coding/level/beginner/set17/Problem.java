package com.codedifferently.coding.level.beginner.set17;

public class Problem {

    /*
       You are given two random temperatures from different states.
       Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
       Both of these statements need to be true to prove that some states have extreme cases of temperatures.

       Return true, if one temp is less than 0 and the other is greater than 100.

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
}