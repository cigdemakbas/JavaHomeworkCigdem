package org.example.HomeworkDec14;

public class Question6 {
    /*  Given a string, split it from ‘:’ and return the new string. If there is no ‘:’ return “There is no ‘:’ in
    the string”.
Examples :
“Name : Daniel” → “NameDaniel”
“My name is Deniel” → “There is no ‘:’ in the string”

     */
    public static void main(String[] args) {
        String sentences= "Name  Daniel ";
        String sentences1= " My name is Daniel ";
        if(sentences.contains(":")){
            sentences= sentences.replace(":","");
            System.out.println(sentences);
        }else {
            System.out.println("there is no :");
        }

    }
}
