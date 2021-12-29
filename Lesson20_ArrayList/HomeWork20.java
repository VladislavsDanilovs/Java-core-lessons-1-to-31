package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork20 {

    public static void main(String[] args) {
      
        ArrayList <String> list1 = new ArrayList <> ();

        list1.add("Martur");
        list1.add("Albert");
        list1.add("Pavlik");

        String list2 = list1.toString();






        // System.out.println(list1);
  
    
    //     String list2 = list1.toString();
      
     
    //     System.out.println(list2.charAt(1));
    //     System.out.println(list2.codePointAt(1));

        for(int i=0; i<list2.length(); i++){
           
            int min =  list2.codePointAt(1);

            if(list2.charAt(i) == ',') {
              
                if (list2.codePointAt(i+2) < min){
                    min = list2.codePointAt(i+2);
                
                    char oldMinChar = list2.charAt(1);
                    char newMinChar = list2.charAt(i+2);

                    System.out.println(min);
               

                    char ch = (char) min;
                    System.out.println(ch);
              
                  
                    // System.out.println(list2.get(0););
                    String M = list2.substring(1, 7);
                    String A = list2.substring(9, 15);
                    String P = list2.substring(17, 23);
                    System.out.println(P);
                    }
            }

    
        }

        
    //     list2.replace("Martur", "Hartur");
    //     System.out.println(list2);
    }
    
}
