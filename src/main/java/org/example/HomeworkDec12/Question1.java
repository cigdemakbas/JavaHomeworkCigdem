package org.example.HomeworkDec12;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question1 {
    /* Write a method that takes an integer minutes,
     converts it to seconds and returns as long.
     */
    public static void main(String[] args) {


        int min, sec;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter minutes");
        min= sc.nextInt();
        sec=min*60;
        System.out.println("Seconds : "+ sec);

    }
}