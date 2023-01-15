package org.example.HomeworkDec13.Part2;

public class Q12 {
    /* We have a loud talking parrot. The "hour" parameter is the current hour time
    in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or
    after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false


     */
    public boolean Parrot(boolean talk, int h){
        return talk & ((h<7)| h>20);
    }

    public static void main(String[] args) {
        Q12 a= new Q12();
        System.out.println(a.Parrot(true,22));
        System.out.println(a.Parrot(false,8));
    }

}
