package org.example.HomeworkDec13.Part3;

public class Q58 {
    /* Java Program to Calculate the Power of a Number
input: powerOfANumber(3,4); output: 81
input: powerOfANumber(2,5); output: 32

     */
    public static void main(String[] args) {
        int base =2, exponent=5;
        long result=1;
        for(;exponent!=0; -- exponent){
            result *= base;
        }
        System.out.println(result);

    }
}
