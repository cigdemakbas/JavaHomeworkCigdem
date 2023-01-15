package org.example.HomeworkDec13.Part2;

public class Q9 {
    /* The parameter weekday is true if it is a weekday, and the parameter vacation is true
    if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true
    if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

     */
    public static void main(String[] args) {

        Q9 h= new Q9();
        System.out.println(h.Q9(true,false));
    }
    boolean Q9 (boolean weekday, boolean vacation){
        if(weekday & ! vacation)return false;
        else return true;
    }
}
