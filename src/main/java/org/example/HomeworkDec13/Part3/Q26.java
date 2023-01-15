package org.example.HomeworkDec13.Part3;

public class Q26 {
    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false


     */
    public static void main(String[] args) {
        Q26 h = new Q26();
        int[] a = new int[]{1, 9, 3, 5};
        System.out.println(h.numbers(a));


    }

    public static boolean numbers(int[] a) {
        for (int i = 0; i < a.length & i < 4; i++) {
            if (a[i] == 9) {
                return true;
            }
        }
        return false;

    }
}