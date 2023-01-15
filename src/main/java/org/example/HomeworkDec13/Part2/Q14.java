package org.example.HomeworkDec13.Part2;

public class Q14 {
    /* Given an int n, return true if it is within 10 of 100 or 200.
     Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

     */
    public static void main(String[] args) {
        Q14 a= new Q14();

        System.out.println(a.numbers(195));

    }
    public boolean numbers(int n){
        return 100 >= Math.abs(n)& Math.abs(n)>=90 | 200 >= Math.abs(n) & Math.abs(n) >=190;
    }

}
