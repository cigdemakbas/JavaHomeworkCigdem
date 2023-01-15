package org.example.HomeworkDec13.Part3;

public class Q29 {
    /*  Given an array of ints, we'll say that a triple is a value appearing 3 times
    in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false


     */
    public static void main(String[] args) {
     Q29 h= new Q29();
     int []a= new int []{1,1,1,2,2,2,1};
        System.out.println(h.triple(a));
    }
    boolean triple(int[] a){
        for (int i=2;i<a.length;i++){
            if((a[i-1]==a[i-2])&(a[i] == a[i-1])){
                return false;
            }
        }
        return true;
    }
}
