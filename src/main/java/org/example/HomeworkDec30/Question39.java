package org.example.HomeworkDec30;

public class Question39 {
    String type= "Canine";
    int maxSpeed= 60;
    Question39 (){

    }
    Question39 (String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}
class WildAnimal extends Question39{
    String bounds;
    WildAnimal(String bounds){
     super();
     this.bounds=bounds;
    }
    WildAnimal(String type, int maxSpeed, String bounds){
        super(type, maxSpeed);
        this.bounds=bounds;


    }

    public static void main(String[] args) {
        WildAnimal wolf= new WildAnimal("Long");
        WildAnimal tiger= new WildAnimal("Feline",80,"Short");
        System.out.println(wolf.type+ " "+tiger.maxSpeed+" "+tiger.bounds);
    }
}
