package org.example.HomeworkDec13.Part2;

public class Q7 {
    /* Define a method to find out if number is prime or not.

     */
    public static void main(String[] args) {

        Q7 a = new Q7();
        a.PrimeNumber(13);
    }

    public void PrimeNumber(int num) {

        boolean flag = false;
        if (num == 0 || num == 1) System.out.println("It's not prime number: " + num);
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("This is not Prime number: " + num);
        } else {
            System.out.println("This is a Prime Number: " + num);
        }
    }
}