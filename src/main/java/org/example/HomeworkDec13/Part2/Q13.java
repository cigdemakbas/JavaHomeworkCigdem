package org.example.HomeworkDec13.Part2;

public class Q13 {
    /* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true


     */
    public boolean Ten(int a, int b) {
        boolean sum= true;
        if (a + b == 10 || a == 10 || b == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

            return sum;



    }

    public static void main(String[] args) {
        Q13 g= new Q13();
        g.Ten(2,8);
        g.Ten(10,6);
        g.Ten(3,5);
        g.Ten(3,4);
        g.Ten(6,4);


    }


}
