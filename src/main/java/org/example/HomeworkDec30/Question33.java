package org.example.HomeworkDec30;

import org.example.HomeworkDec14.Question1;
import org.example.HomeworkDec29.Question13;

public class Question33 {
    String name;
    boolean contract;
    double salary;
    Question33 (){

    }
    public String toString(){
        return name+": "+contract+ ": "+ salary;
    }

    public static void main(String[] args) {
        Question33 e= new Question33();


        System.out.println(e);             // output: A and D
    }

}
