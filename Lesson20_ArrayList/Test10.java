package Lesson20;

import java.util.ArrayList;

public class Test10 {

    public static void main(String[] args) {
        ArrayList <String>al1 = new ArrayList <> ();

        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        for(Object s : al1) {
            System.out.println("number= " + s+ " and length= "+ ((String)s).length());

        }

      
    }
    
}
