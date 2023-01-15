package org.example.HomeworkDec13.Part3;

public class Q34 {
    /* Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7

     */
    public static void main(String[] args) {
        Q34 w= new Q34();
        int a[]= new int []{5,2,3};
        System.out.println(w.sum(a));
    }
    public int sum(int a[]){

        int sum = a[0]+a[1]+a[2];
        return sum ;

    }
}
