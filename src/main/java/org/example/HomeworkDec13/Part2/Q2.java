package org.example.HomeworkDec13.Part2;

public class Q2 {
    /*
    Define a program to find out whether a given number is even or odd.
     */
    public static void main(String[] args) {
        Q2 h= new Q2();
        h.OddOrEvenNumbers(23);
    }
    void OddOrEvenNumbers(int number){

        if(number%2==0){
            System.out.println(" This number is even : "+number);
        }else {
            System.out.println("This number is odd : " +number);
        }

    }
}
