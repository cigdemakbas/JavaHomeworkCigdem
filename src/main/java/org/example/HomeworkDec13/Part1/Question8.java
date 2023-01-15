package org.example.HomeworkDec13.Part1;

public class Question8 {
    /*
    Write a Java program to check if a number is Armstrong's number or not?
(input 153 output true,  123 output false)
     */
    public static void main(String[] args) {

    }
    void Q8(int number){

        int temp,remainder,n=0;
        temp=number;
        double result=0;
        while(temp !=0){ temp/=10;
            n++;}
        temp=number;
        while(temp >0){
            remainder=temp%10;
            result += Math.pow(remainder,n);
            temp/=10;
        }
        if(result==number){
            System.out.println("Armstrong Number :"+number);
        }else {
            System.out.println("Number: "+number+" is not Armstrong.");
        }
    }

}

