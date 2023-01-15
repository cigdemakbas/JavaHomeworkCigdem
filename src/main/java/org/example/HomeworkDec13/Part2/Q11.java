package org.example.HomeworkDec13.Part2;

public class Q11 {
   /* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

            sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8

    */
    public int Sum(int a, int b){
        int res= a+b;
        if( a==b ){
             res*=2;
        }
        return res;
    }

    public static void main(String[] args) {
        Q11 h= new Q11();
        System.out.println(h.Sum(3,5));
        System.out.println(h.Sum(4,4));
        System.out.println(h.Sum(4,6));
    }

}
