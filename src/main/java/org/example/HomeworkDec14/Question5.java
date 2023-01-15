package org.example.HomeworkDec14;

public class Question5 {
    /* Given a string, remove the spaces between words.
Examples :
“My name is Arthur. I am 20 years old.” →”MynameisArthur.Iam20yearsold.”

     */
    public static void main(String[] args) {
        String word= "My name is Arthur. I am 20 years old. ";
        System.out.println(word.replaceAll(" ",""));
    }
}
