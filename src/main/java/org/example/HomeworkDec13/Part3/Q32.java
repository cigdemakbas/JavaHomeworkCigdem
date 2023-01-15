package org.example.HomeworkDec13.Part3;

public class Q32 {
    /*  Given an array of ints, return true if the array is length 1 or more, and
    the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true

     */
    public static void main(String[] args) {
        Q32 q=new Q32();
        int a[]= new int []{1,2,1};
        System.out.println(q.equal(a));
    }
    public boolean equal(int []a){
        return a[0]==a[a.length-1] & a.length>=1;
    }
}
