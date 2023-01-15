package org.example.HomeworkDec13.Part3;

public class Q28 {
    /* Given an array of ints, return the number of times that two 6's are next to each other
     in the array. Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1

     */
    public static void main(String[] args) {
      Q28 h= new Q28();
      int []a = new int[]{5,7,2,8};
        System.out.println(h.list(a));
    }
    int list(int[]a){
        int counter=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==6){
                ++i;
                if(i>a.length-1) {
                    break;
                }else if (a[i]==6|a[i]==7) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
