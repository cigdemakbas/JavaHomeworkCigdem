package org.example.HomeworkDec13.Part3;

public class Q54 {
    /* Java Program to Check Whether a Character is Alphabet or Not
input : isAlphabet('*')  output: false
input : isAlphabet('A')  output: true
input : isAlphabet('k')  output: true
input : isAlphabet('#')  output: false

     */
    public static void main(String[] args) {
        Q54 d= new Q54();

        System.out.println(d.alphabet('>'));
    }
    boolean alphabet(char c){
        return (c >= 65 & c<= 90)|(c>= 97 & c<=122);
    }
}
