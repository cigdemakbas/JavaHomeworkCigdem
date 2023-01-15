package org.example.HomeworkDec13.Part3;

public class Q56 {
    /* Java Program to Generate Multiplication Table
input: multiplicationTable(5);
output:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

     */
    public static void main(String[] args) {
        Q56 f= new Q56();
        f.mt(6);
        }

        void mt(int n){
        for(int i=1; i<=10;i++){
            int res= n*i;
            System.out.println(n+" * "+i+" = "+res);
        }

    }
}