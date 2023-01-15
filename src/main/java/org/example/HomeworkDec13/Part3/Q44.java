package org.example.HomeworkDec13.Part3;

public class Q44 {
    /* Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be
    length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false

     */
    public static void main(String[] args) {
      Q44 o= new Q44();
      int a[]= new int[]{4,4};
        System.out.println(o.same(a));
    }
    boolean same(int []a){
        return (a[0]==2 &a[1]==2)|(a[0]==3 & a[1]==3);
    }
}
