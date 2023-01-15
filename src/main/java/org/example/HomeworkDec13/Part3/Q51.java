package org.example.HomeworkDec13.Part3;

public class Q51 {
    /* A prime number is a natural number greater than 1 that has no positive divisors other than
    1 and itself.
Write a method that checks if a number is a prime number.

     */
    public static void main(String[] args) {
        Q51 e= new Q51();
        e.Q51(12);

    }
    void Q51(int a) {
        boolean flag=false;
        for (int i = 2; i <= a/2 ; i++) {
            if (a % i == 0) {
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("It is not a prime number :"+a);
        }else {
            System.out.println("It is a prime number :"+a);
        }

    }
}
