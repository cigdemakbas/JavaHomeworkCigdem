package org.example.HomeworkDec13.Part2;

public class Q3 {
    /* A person is elligible to vote if his/her age is greater than or equal to 18.
    Define a method to find out if he/she is elligible to vote.
     */
    public static void main(String[] args) {
        Q3 D= new Q3();
        D.EligibleVote(45);
        D.EligibleVote(13);

    }
    void EligibleVote (int age){
        if(age >= 18){
            System.out.println(" he/she is elligible to vote");
        }else {
            System.out.println(" he/she is NOT elligible to vote");
        }
    }
}
