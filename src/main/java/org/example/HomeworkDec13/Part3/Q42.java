package org.example.HomeworkDec13.Part3;

public class Q42 {
    /* Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → fals


     */
    public static void main(String[] args) {
        Q42 e= new Q42();
        int a[]= new int[]{3,5};
        System.out.println(e.abc(a));
    }
    public boolean abc(int a[]){
        return !(a[0]==3|a[1]==3|a[0]==2|a[1] ==2);

    }
}
