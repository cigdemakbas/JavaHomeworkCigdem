package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q41 {
    /* Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false

     */
    public static void main(String[] args) {
     Q41 s= new Q41();
     int []a= new int[]{1,7};
        System.out.println(s.contains(a));
    }
    public boolean contains(int []a){
       return a[0]==2 | a[1]==2 | a[0]==3 | a[1]==3;

    }
}
