package org.example.HomeworkDec29;

public class Question14 {
    public static void main(String[] args) {
        String str= "Sweet Sweat";
        String str2= str.trim().charAt(6)+" "+str.indexOf("sw",1);
        System.out.println(str2);
        System.out.println(str.indexOf("w",3));
    }                                 // output: s-1
}
