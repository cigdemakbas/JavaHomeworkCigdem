package org.example.HomeworkDec30;

public class Question37 {
    public static void main(String[] args) {
        int data[]= {2010,2013,};
        int key= 2014;
        int count= 0;
        for(int e:data){
            if(e!= key){
                continue;
               // count++;
            }
        }
        System.out.println(count+" Found");   // A- compile error
    }
}
