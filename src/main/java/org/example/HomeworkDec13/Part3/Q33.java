package org.example.HomeworkDec13.Part3;

public class Q33 {
    /* Given 2 arrays of ints, a and b, return true if they have the same first element or
     they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true


     */
    public static void main(String[] args) {
        Q33 h= new Q33();
        int a[]= new int  []{1,2,3};
        int b[]= new int []{7,3};
        System.out.println(h.same(a,b));
    }
    boolean same(int[]a, int[]b){
       return a[0]==b[0] ||  a[a.length - 1] == b[b.length - 1];
    }
}
