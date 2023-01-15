package org.example.HomeworkDec13.Part1;

import java.util.Scanner;

public class Question1 {
    /*  write a method that can convert km to miles
            1 km = 0.612 miles

     */
    public static void main(String[] args) {
        Question1 a= new Question1();
        a.Convert();

    }
    public double Convert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km");
        double km= sc.nextDouble();
        double miles=km/0.612;
        System.out.println("km value :"+miles);

        return km;
    }

}
