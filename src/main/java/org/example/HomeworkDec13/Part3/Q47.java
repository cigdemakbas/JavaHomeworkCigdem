package org.example.HomeworkDec13.Part3;

public class Q47 {
    /* Write a java program to find the perimeter of a rectangular, square, circle, triangle

     */
    public static void main(String[] args) {
        Q47 f= new Q47();
        f.perimeter(2,3);


    }
    public void perimeter(int a, int b){

        int recP = 2 * a + 2 * b;
        int triP=a+a+b;
        double cirP= 2 * 3.14 * a * a;
        int sqP= 4*a;
        System.out.println("perimeter of rectangle :"+recP+"\n"+" p of triangle :"+triP+"\n"+"p of circle : "+cirP+"\n"+"p of square :"+sqP);
    }
}