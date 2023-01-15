package org.example.HomeworkDec13.Part3;

import java.util.Arrays;

public class Q40 {
    /* Given an array of ints, return a new array length 2 containing the first and last elements
    from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]


     */
    public static void main(String[] args) {
     Q40 w= new Q40();
     int a[]= new int[]{1,2,3,4};
        System.out.println(Arrays.toString(w.firstAndLast(a)));

    }
    public int [] firstAndLast(int[]a) {
        int sum[] = new int[]{a[0], a[a.length - 1]};
        return sum;
    }
}
