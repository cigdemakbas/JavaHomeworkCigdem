package org.example.HomeworkDec13.Part3;

public class Q46 {
    /* You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all
     different from each other, the result is 0. If all of the numbers are the same, the result
      is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10

     */
    public static void main(String[] args) {
        Q46 d = new Q46();
        System.out.println(d.tickets(1, 2, 3));
    }

    int tickets(int a, int b, int c) {
        if (a == b & b == c) {
            return 20;
        } else if (a != b & b != c) {
            return 0;
        } else if ((a == b & a != c) | (a == c & a != b) | (b == c & b != a)) {
            return 10;
        }return a;

    }
}
