package org.example.HomeworkDec13.Part2;

public class Q21 {
    /* Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

     */
    public static void main(String[] args) {
        Q21 h= new Q21();
        System.out.println(h.largestNumber(2,3,5));

    }
    public int largestNumber(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else {
            return c;
        }
    }
}
