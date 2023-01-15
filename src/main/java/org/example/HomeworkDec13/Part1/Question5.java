package org.example.HomeworkDec13.Part1;

public class Question5 {
    /*
    write a method that can calculate grade
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
     */


    public static void main(String[] args) {

        Question5 a= new Question5();
        a.CalculateScore(100);
        a.CalculateScore(34);
    }
    public void CalculateScore(int score){
        if(score>=90 && score<=100){
            System.out.println("A");
        }else if (score <90 && score>=80){
            System.out.println("B");
        }else if( score>=70 && score<80){
            System.out.println("C");
        }else if(score>=60 && score<70){
            System.out.println("D");
        } else if (score>=50 && score<60) {
            System.out.println("E");
        } else {
                System.out.println("invalid score");

                }

            }
        }
