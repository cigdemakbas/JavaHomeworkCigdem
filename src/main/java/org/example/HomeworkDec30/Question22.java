package org.example.HomeworkDec30;

public class Question22 {
    public static void main(String[] args) {
        int ans;
        try {
            int num=10;
            int div=0;
            ans= num/div;
        }catch (ArithmeticException ae){
            ans=0;
        }catch (Exception e){
            System.out.println("invalid calc");
        }
     //   System.out.println("Answer = "+ans);     output: compilation fails at this line
    }
}
