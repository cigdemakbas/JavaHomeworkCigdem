package org.example.HomeworkDec12;

public class Question2 {
    /* Write a method that returns true when x is equal to y; otherwise return false.

     */
    public static void main(String[] args) {
        Question2 a=new Question2();
        a.isValid();
        System.out.println(a.isValid());

    }

  public boolean isValid(){
      boolean check;
      int x =5;
      int y=5;
      if(x==y){
          check=true;
      }else{
          check=false;
      }
      return check;

  }

}
