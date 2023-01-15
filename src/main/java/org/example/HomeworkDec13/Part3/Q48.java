package org.example.HomeworkDec13.Part3;

public class Q48 {
    /*  Java Program to Calculate Simple Interest
Simple Interest = (P x T x R)/100
Where,

P is the principal amount
T is the time and
R is the rate

     */
    public static void main(String[] args) {
        Q48 w= new Q48();
        w.simpleInt(304,2,1);
    }
    public void simpleInt(int p, int t, int r){
        double simpleInterest= (p*t*r)/100;
        System.out.println(simpleInterest);
    }
}

