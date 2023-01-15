package org.example.HomeworkDec13.Part2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q6 {
    /* Write a program to print the circumference and area of a circle of
    radius entered by user by defining your own method.
     */
    // A=πr² , C=2πr
    public static void main(String[] args) {
        Q6 a= new Q6();
        a.Circle();
    }
    public void Circle(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the radius of circle");
        int radius= sc.nextInt();
        int areaCircle= 3*radius*radius;
        System.out.println(" The area of circle is : "+areaCircle);
        int circumference=2*3*radius;
        System.out.println("The circumference of circle is : "+circumference);
        sc.close();
    }
}

