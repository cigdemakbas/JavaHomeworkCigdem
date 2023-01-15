package org.example.HomeworkDec13.Part2;

public class Q1 {
    /* Define two methods to print the maximum and the minimum number
    respectively among three numbers entered by user.
     */
    public static void main(String[] args) {
        Q1 h= new Q1();
        h.Max(3,4,5);
        h.Min(4,6,5);
    }


    void Max(int n1, int n2, int n3){
        if(n1>n2 && n1>n3 ){
            System.out.println(" Max number is "+n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println(" Max number is "+n2);

        }else if (n3>n1 && n3>n2){
            System.out.println(" Max number is "+n3);
        }else {
            System.out.println(" invalid numbers");
        }

    }
    void Min(int n1, int n2, int n3){
        if(n1<n2 && n1<n3 ){
            System.out.println(" Min number is "+n1);
        } else if (n2<n1 && n2<n3) {
            System.out.println(" Min number is "+n2);

        }else if (n3<n1 && n3<n2){
            System.out.println(" Min number is "+n3);
        }else {
            System.out.println(" invalid numbers");
        }

    }
}