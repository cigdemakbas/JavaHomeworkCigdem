package org.example.HomeworkDec30;

public class Question24 {
    public Question24 (){
        System.out.println("A");
    }
}
class B extends Question24{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c= new C();
    }
}