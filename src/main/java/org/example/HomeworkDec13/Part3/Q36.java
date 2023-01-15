package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q36 {
    /* Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]

     */
    public static void main(String[] args) {
        int []a= new int[]{1,2,3,4,5};
        Q36 h=new Q36();
        System.out.println(Arrays.toString(h.reverseA(a)));

    }
    int []reverseA(int a[]){
        int reverse[]= new int[a.length];
        int j=0;
        for(int i=a.length-1; i>=0; i--){
            reverse[j++]=a[i];
        }
        return reverse;
    }

}
