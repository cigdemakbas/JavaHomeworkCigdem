package org.example.HomeworkDec13.Part2;

public class Q19 {
    /*  Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

     */
    public static void main(String[] args) {
        Q19 h= new Q19();
        System.out.println(h.values(8,99));

    }
    public boolean values(int a, int b){
        return (a>10 & a<20) | (b<20 & b>10);

    }
}
