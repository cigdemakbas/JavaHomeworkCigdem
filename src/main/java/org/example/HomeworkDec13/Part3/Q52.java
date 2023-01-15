package org.example.HomeworkDec13.Part3;

public class Q52 {
    /*  Write a method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci
     numbers that are less than or equal to n.
Each new element in the Fibonacci sequence is generated by adding the previous two elements.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...


     */
    public static void main(String[] args) {
     Q52 d= new Q52();
        System.out.println(d.fibonacciNumbers(65));
    }
    public int fibonacciNumbers(int n){
       int n1=0, n2=2;
       int sum=n1+n2;
       while (n2<=n){
           int n3=4*n2+n1;
           if(n3>n){
               break;
           }
           n1=n2;
           n2=n3;
           sum+=n2;
        }
       return sum;
    }



}
