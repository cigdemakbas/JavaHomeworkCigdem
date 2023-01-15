package org.example.HomeworkDec14;

public class Question1 {
    /*  Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
Examples :
"Clarusway" → "ayayay"
"Florida" → "dadada"
"Hi" → "HiHiHi"

     */
    public static void main(String[] args) {
        Question1 d= new Question1();
        System.out.println(d.repeat("Clarusway"));
        System.out.println(d.repeat("Florida"));
        System.out.println(d.repeat("cigdem"));
    }
    String repeat(String word){
        word= word.substring(word.length()-2);
        return word.repeat(3);
    }

}
