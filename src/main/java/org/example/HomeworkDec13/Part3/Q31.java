package org.example.HomeworkDec13.Part3;

public class Q31 {
    /*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false

     */
    public static void main(String[] args) {
        Q31 q= new Q31();
        int a[]= new int []{4,1,2,3,6};
        System.out.println(q.element(a));
    }
    public boolean element(int []a){
        return a[0]==6 | a[a.length-1]==6;
    }

}
