package org.example.HomeworkDec25;

public class Q10 {
    public static void main(String[] args) {
        int var1=200;
        System.out.print(doCalc(var1));
        System.out.print(" "+var1);
    }
    static int doCalc(int var1){
        var1= var1*2;
        return var1;                     // output : 400 200
    }
}
