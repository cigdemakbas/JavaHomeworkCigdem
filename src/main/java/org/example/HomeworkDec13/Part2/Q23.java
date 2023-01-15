package org.example.HomeworkDec13.Part2;

public class Q23 {
    /* Given 2 int values, return true if they are both in the range 30..40 inclusive, or
     they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

     */
    public static void main(String[] args) {
        Q23 h= new Q23();
        System.out.println(h.range(40,50));

    }
    boolean range(int a, int b){
      return  ((30<=a & a<=40) & (30<=b & b<=40)) | ((a>=40&a<=50) & (b>=40 &b<=50));
    }


}
