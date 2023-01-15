package org.example.HomeworkDec13.Part2;

public class Q18 {
    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false

     */
    public static void main(String[] args) {
        Q18 s= new Q18();
        System.out.println(s.temperature(2,120));
    }
    public boolean temperature(int a, int b){
        return (a<0 & b>100) | (a>100 & b<0) ;
    }
}
