package org.example.HomeworkDec12;

import java.util.Scanner;

public class Question5 {
    /* Write a method that accepts a measurement value in inches and returns the equivalent
     of the measurement value in feet.
     */
    public double feetToInches(){



        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter feet value");

        double feet= sc.nextDouble();
        double inches= feet*12;

        System.out.println(inches+  " Inches");
        return feet;

    }
    public static void main(String[] args) {
        Question5 m= new Question5();
        m.feetToInches();


    }
}
