package org.example.HomeworkDec13.Part3;

public class Q57 {
    /*
    Java Program to Reverse a Number
input: reverseNumber(3798); output: 8973

     */
    public static void main(String[] args) {
        int num= 3798, reversed= 0;
        for(;num !=0; num/=10){
            int digit= num %10;
            reversed= reversed*10+digit;
        }
        System.out.println("Reversed number "+reversed);

    }

}
