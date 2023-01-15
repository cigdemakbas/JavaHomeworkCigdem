package org.example.HomeworkDec13.Part3;

public class Q49 {
    /* Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
input : [2,5,3,14,5,25]
output: Largest number is : 25


     */
    public static void main(String[] args) {
        Q49 y= new Q49();
        int a[]= new int[]{1,9,3,6,7};
        System.out.println(y.largestNumber(a,5));

    }
    int  largestNumber(int a[], int total){
        int temp;
        for(int i= 0; i<total; i++){
            for (int j=i+1; j<total; j++){
                if(a[i]>a[j]){
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-1];

    }

}
