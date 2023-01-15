package org.example.HomeworkDec13.Part1;

public class Question7 {
    /*  Write a Java program start with an integer n, divide n by 2 if n is
     even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
     */

    public static void main(String[] args) {
        Question7 h= new Question7();
        h.Question7(3);

    }
    void Question7(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = (n * 3 + 1) / 2;
                System.out.println(n);
            }
        }
    }  }