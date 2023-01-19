package org.example.HomeworkDec30;

public class Question23 {
    public static void main(String[] args) {
        char colorCode='y';
        switch (colorCode){
            case 'r' :
                int color=100;
                break;
            case 'b':
                color=10;
                break;
            case 'y':
                color=1;
                break;
        }
       // System.out.println(color);            compile error at this line
    }
}
