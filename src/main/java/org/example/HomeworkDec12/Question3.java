package org.example.HomeworkDec12;

public class Question3 {
    /*  Write a class that includes methods like getAreaSquare and
    getAreaTriangle and when you call these methods with needed parameters
    to calculate the area they should
     return the area values for a square and triangle
     */
    public int getAreaSquare(int x){
         int areaSquare=x*x;
         return areaSquare;
    }
    public int getAreaTriangle(int a, int h){
        int areaTriangle=a*h/2;
        return areaTriangle;

    }

    public static void main(String[] args) {
        Question3 calc= new Question3();

        System.out.println(calc.getAreaSquare(4));
        System.out.println(calc.getAreaTriangle(2,8));
    }
}
