package org.example.HomeworkDec13.Part3;

public class Q53 {
    /* Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each)
    , write a method that returns true if it is possible to make a package with goal kilos of rice.
     */
    public static void main(String[] args) {
Q53 t= new Q53();
        System.out.println(t.bags(4,5,3));
    }
    boolean bags(int sbag, int bbag, int goal){
        boolean result= false;
        if(bbag*5>= goal){
            if(sbag>=goal %5)
                result=true;
        }else{
            if(sbag>goal - bbag*5){
                result= true;
            }
        }
        return true;
    }

}
