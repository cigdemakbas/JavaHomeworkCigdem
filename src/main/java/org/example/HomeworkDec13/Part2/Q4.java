package org.example.HomeworkDec13.Part2;

import java.util.Scanner;

public class Q4 {
    /* Write a program to print the sum of two numbers entered by user by defining your own method.

     */

    public static void main(String[] args) {


        Q4 h = new Q4();
        h.Sum();

    }
    void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 2 numbers for adding ");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
            int sum;
            sum=n1+n2;
            System.out.println(" Sum is : "+sum);
    }
}
