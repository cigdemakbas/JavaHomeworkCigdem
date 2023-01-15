package org.example.HomeworkDec13.Part1;

import java.util.Scanner;

public class Question2 {
    /* write a method that can convert gallons to litters
            1 G = 3.75 L

     */
    public static void main(String[] args) {
        Question2 h= new Question2();
        h.GallonsToLitters();

    }
    public double GallonsToLitters (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the gallons value");
        double GallonsValue= sc.nextDouble();
        double LitterValue= 1/3.75*GallonsValue;
        System.out.println(" Litter value is "+ LitterValue);
        return LitterValue;
    }
}
