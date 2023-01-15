package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q37 {
    /*  Given an array of ints length 3, figure out which is larger, the first or last element
     in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

     */
    public static void main(String[] args) {
      Q37 h= new Q37();
      int a[]= new int[]{1,4,6};
        System.out.println(Arrays.toString(h.maxNumber(a)));
    }
    int []maxNumber(int a[]){
        int i= Math.max(a[0],a[a.length-1]);
        Arrays.fill(a,i);
        return a;
    }

}
