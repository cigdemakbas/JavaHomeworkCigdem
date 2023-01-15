package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q35 {
    /* Given an array of ints length 3, return an array with the elements
     "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]

     */
    public static void main(String[] args) {
        Q35 h= new Q35();

        int[] a =new int [] {1, 2, 3};
        System.out.println(Arrays.toString(h.rotate(a)));


        }
       int []rotate(int []a){
           int temp = a[0];
           for (int i =0 ; i<a.length-1;i++){
               a[i]=a[i+1];
           }
           a[a.length-1]=temp;
           return a;


        }


    }
