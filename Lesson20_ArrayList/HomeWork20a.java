package Lesson20;

import java.util.*;

public class HomeWork20a {
    
    public ArrayList <String> abc(String...a){

        ArrayList <String> aL = new ArrayList <> ();

        for(String b : a){
            if(!aL.contains(b))
            aL.add(b);
           
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }
    
}

class HomeWork20aTest{
    public static void main(String[] args) {
        HomeWork20a h = new HomeWork20a(); 
        h.abc("hello", "hi", "bye", "goodbye", "f");
    }
}
