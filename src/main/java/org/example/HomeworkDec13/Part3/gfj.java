package org.example.HomeworkDec13.Part3;

public class gfj {
    public static void main(String[] args) {
        gfj e= new gfj();
        System.out.println(e.tickets(3,3,3));
    }
    int tickets(int a, int b, int c){

      if (a == b & b == c) {
        return 20;
    } else if (a == b | a == c | b == c) {
        return 10;
    }
        return 0;
}
}
