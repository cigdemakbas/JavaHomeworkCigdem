package org.example.HomeworkDec13.Part2;

public class Q22 {
    /*  Given 2 int values, return whichever value is nearest to the value 10,
     or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

     */
    public static void main(String[] args) {
        Q22 h= new Q22();
        System.out.println(h.nearestNumber(12,3));

    }
    int nearestNumber(int a, int b){
        int res1=Math.abs(a-10);
        int res2=Math.abs((b-10));
        if(res1<res2) return a;
        else if (res1>res2) return b;
        else return 0;
    }
}
