package org.example.HomeworkDec13.Part1;

import java.util.Arrays;

public class Question3 {
    /*  write a method that can print out the array in Descending order

     */
    public static void main(String[] args) {
        int array []= {1,2,3,4,5,6};
        Arrays.sort(array);
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int []array){
        int n= array.length;
        for (int i = 0; i < n/2; i++) {
            int temp=array[i];
            array [i]= array[n-i-1];
            array [n-i-1]=temp;

        }
    }

}
