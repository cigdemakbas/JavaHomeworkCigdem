package org.example.HomeworkDec13.Part3;

public class Q30 {
    /* Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
    followed by the value plus 5, followed by the value minus 1. Additionally, the 271 counts even
    if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

     */
    public static void main(String[] args) {
        Q30 h= new Q30();
        int a[]= new int []{1,2,7,0,5};
        System.out.println(h.contain(a));

    }
    boolean contain(int a[]){
        for(int i=0; i<= a.length-1; i++){
            if(i+2<a.length & i+1<a.length){
                if(a[i+1]== a[i]+5){
                    if (a[i + 2] == a[i] - 1 | a[i + 2] == a[i] - 2) {
                        return true;
                }
            }
            }

        }
        return false;
    }
}
