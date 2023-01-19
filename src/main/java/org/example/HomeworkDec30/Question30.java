package org.example.HomeworkDec30;

import java.util.ArrayList;
import java.util.List;

public class Question30 {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("jon");
        }
        System.out.println(names);     //output:[Robb, Rick, Bran]

    }
}
