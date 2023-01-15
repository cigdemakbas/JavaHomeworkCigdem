package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q38 {
    /*  Given an array of ints, return the sum of the first 2 elements in the array.
     If the array length is less than 2, just sum up the elements that exist, returning 0 if
     the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2

     */
    public static void main(String[] args) {
        Q38 g= new Q38();
        int a[]= new int []{1,1,1};
        System.out.println(Arrays.toString(g.calc(a)));


    }
    int [] calc(int[] a) {
        int sum = 0;
        if (a.length >= 2) {
            sum = a[0] + a[1];

        }return new int[]{sum};

    }
}
