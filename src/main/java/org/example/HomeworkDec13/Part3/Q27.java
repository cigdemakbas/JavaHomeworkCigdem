package org.example.HomeworkDec13.Part3;

public class Q27 {
    /* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array
    somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true

     */
    public static void main(String[] args) {
      Q27 g= new Q27();
      int []a= new int [] {1,2,0,9,6,2,3};
        System.out.println(g.array123(a));
    }

    public boolean array123(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                i++;
                if (i > a.length - 1) {
                    break;
                } else if (a[i] == 2) {
                    ++i;
                    if (i > a.length - 1) {
                        break;

                    } else if (a[i] == 3) {
                        return true;

                    }
                }
            }
        }
        return false;

    }
}
