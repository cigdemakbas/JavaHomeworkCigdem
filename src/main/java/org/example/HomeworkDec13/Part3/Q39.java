package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q39 {
    /* Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their
    middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]


     */
    public static void main(String[] args) {

        Q39 h= new Q39();
        int a[]= new int[]{1,5,3};
        int b[]= new int[]{4,8,6};
        System.out.println(Arrays.toString(h.newArray(a, b)));

    }
    public int [] newArray(int a[], int b[]){

        int newInt[]= new int[]{a[1], b[1]};
        return newInt;
    }

}
