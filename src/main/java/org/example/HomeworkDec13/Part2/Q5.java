package org.example.HomeworkDec13.Part2;

import java.util.Scanner;

public class Q5 {
    /* Define a method that returns the product of two numbers entered by user.

     */
    public static void main(String[] args) {
     Q5 h= new Q5();
     h.Product();
        System.out.println(h.Product());
    }
    int[] Product(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num[] = new int[2];
        num[0] = sc.nextInt();
        num[1]= sc.nextInt();
        sc.close();
        return num;
    }
}
