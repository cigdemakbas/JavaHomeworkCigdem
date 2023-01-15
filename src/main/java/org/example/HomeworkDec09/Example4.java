package org.example.HomeworkDec09;
import java.util.Arrays;

public class Example4 {
    /* Create a program that moves all the zeros in a given array to the end in place

Input:[1,0,1,1,0,0,0,1]
Output:[1,1,1,1,0,0,0,0]

     */
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void partition(int[] A) {
        int j = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                swap(A, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int [] A= {6,0,8,2,3,0,4,0,1};
        partition(A);
        System.out.println(Arrays.toString(A));
    }
}



