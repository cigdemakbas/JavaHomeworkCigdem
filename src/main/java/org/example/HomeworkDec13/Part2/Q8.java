package org.example.HomeworkDec13.Part2;

import java.util.Scanner;

public class Q8 {
    /* Write a program which will ask the user to enter his/her marks (out of 100).
     Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail

     */
    public static void main(String[] args) {
        Q8 d= new Q8();
        d.markAndGrade();

    }
    public void markAndGrade(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter your mark");
        int mark= sc.nextInt();
        if (mark <=100 && mark>90){
            System.out.println("Your grade is AA");
        }else if (mark<=90 && mark>80){
            System.out.println("Your grade is AB");
        }else if (mark>70 && mark<=80){
            System.out.println("Your grade is BB");
        }else if (mark>=60 && mark<70){
            System.out.println("Your grade is BC");
        }else if (mark >50 && mark <=60){
            System.out.println(" Your grade is CD");
        }else if (mark <=50 && mark>40){
            System.out.println("Your grade is DD");
        }else if (mark<=40){
            System.out.println(" You failed");
        }
    }
}
