package org.example.HomeworkDec09;

public class Example3 {
    /* Create a program that rotates the contents of an array to the right, returning new array

Input:{1,2,3,4,5}
Output:{5,1,2,3,4}
Output:{4,5,1,2,3}

     */
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int n=2;
        System.out.println("Original : ");
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        for(int i=0; i<n;i++){
            int j, last;
            last=arr[arr.length-1];
            for(j= arr.length-1; j>0;j--){
                arr[j]=arr[j-1];

            }
            arr[0]=last;
        }
        System.out.println();
        System.out.println("After right rotation :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
