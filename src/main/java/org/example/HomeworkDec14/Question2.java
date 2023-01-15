package org.example.HomeworkDec14;

public class Question2 {
    /*  Given a string, return true if it’s ending with ‘a’.
     Otherwise return false. The string length will be at least 2.
Examples :
Apple –> false
Canada –> true

     */
    public static void main(String[] args) {
    Question2 d= new Question2();
        System.out.println(d.letterA("canada"));
    }
    public boolean letterA(String word){
        return word.endsWith("a");
    }
}
