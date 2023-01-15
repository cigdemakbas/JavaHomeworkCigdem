package org.example.HomeworkDec13.Part2;

public class Q25 {
    /* Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3

     */
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,4,5,7,8,8};
        int n= arr.length;
        int x=2;
        Q25 h= new Q25();
        System.out.println(h.arrayNumbers(arr,n,x));

    }
    public int arrayNumbers(int arr[],int n, int x){
        int  res=0;
        for(int i=0; i<n;i++)
            if(x==arr[i])
                res++;
        return res;

    }
}
