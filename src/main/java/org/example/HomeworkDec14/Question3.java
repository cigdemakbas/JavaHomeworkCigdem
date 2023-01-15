package org.example.HomeworkDec14;

public class Question3 {
    /* Given a string, return the first index number of ‘a’. If there is no ‘a’ return -1.
Examples :
“Washington” → 1
“New York” → -1
“America” → 0

     */
    public static void main(String[] args) {
        Question3 w= new Question3();
        System.out.println(w.indexNumberOfA("merhaba"));
        System.out.println(w.indexNumberOfA("America"));
        System.out.println(w.indexNumberOfA("washington"));
        System.out.println(w.indexNumberOfA("newyork"));

    }
    int indexNumberOfA(String word){
      if(word.contains("A")){
          return word.indexOf("A");}

        return word.indexOf("a");
    }
}
