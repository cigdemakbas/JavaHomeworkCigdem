package org.example.HomeworkDec13.Part2;

public class Q16 {
   /*  Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"

    */
   public static void main(String[] args) {
      Q16 a= new Q16();

      System.out.println(a.word("cigdem") );
      System.out.println("notHasan");
      System.out.println("  I am cigdem");
      System.out.println(a.word("hasan"));
      System.out.println(a.word("not Hasan"));
      System.out.println(a.word("I am cigdem"));
   }
   public String word(String word1){
       if(word1.contains("not")) {
          return word1;
       }else{
             return "not"+word1;
          }
       }
   }



