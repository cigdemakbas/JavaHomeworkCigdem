package org.example.HomeworkDec13.Part3;

public class Q50 {
    /* Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.


     */
    public static void main(String[] args) {
        Q50 e= new Q50();
        System.out.println(e.Words(10));
        System.out.println(e.Words(15));
        System.out.println(e.Words(11));
        System.out.println(e.Words(30));
        System.out.println(e.Words(12));
    }
    public String Words(int a) {
        if (a % 3 == 0 & a % 5 == 0) {
            return "Fizz";
        } else if (a % 5 == 0) {
            return "Buzz";
        }else if (a%3==0) {
        return "FizzBuzz";}
        return null;
    }
}
