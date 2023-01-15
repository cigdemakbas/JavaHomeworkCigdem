package org.example.HomeworkDec13.Part2;

public class Q17 {
   /*  Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
   Use the % "mod" operator

    or35(3) → true
    or35(10) → true
    or35(8) → false

    */
   public static void main(String[] args) {
       Q17 h= new Q17();
       System.out.println(h.multiple(30));

   }
   public boolean multiple(int a){

           return a%3==0 | a%5==0 ;
       }

   }


