package org.example.HomeworkDec13.Part3;

public class Q55 {
    /* Java Program to Check Whether a Number is Positive or Negative
input: isPositive(12.0)  output: true
input: isPositive(-3)  output: false
input: isPositive(-4.3)  output: false
input: isPositive(5.5)  output: true

     */
    public static void main(String[] args) {
        Q55 h= new Q55();
        System.out.println(h.checkNumber(0.3));
    }
    boolean checkNumber(double a){
        return a>0;
    }
}
