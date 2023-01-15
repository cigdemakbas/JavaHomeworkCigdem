package org.example.HomeworkDec13.Part2;

public class Q15 {
    /* Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true


     */
    public static void main(String[] args) {
        Q15 x= new Q15();

        System.out.println(x.numbers(-3,-5,false));


    }
    public boolean numbers(int a, int b, boolean c){
        if(a>0 & b<0) return true;
        else if (a<0 & b>0) return true;
        else if (a<0 & b<0 & c==true) return true;
        else return false;
    }

}
