package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q43 {
    /*  Given an int array, return a new array with double the length where its last element is the
    same as the original array, and all the other elements are 0. The original array will be
     length 1 or more. Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]

     */
    public static void main(String[] args) {
     Q43 e= new Q43();
     int a[]= new int []{1,2,3};
        System.out.println(Arrays.toString(e.abc(a)));
    }
    int [] abc(int a[]){

       int b[] = new int [2*a.length];
        b[b.length-1]=a[a.length-1];
        return b;

    }
}
