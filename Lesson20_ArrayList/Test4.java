package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("Maxim");
        list.add(sb);
      
      
        list.add(new StringBuilder("Petrov"));

        list.add(new StringBuilder("Pavlik"));
        list.add(new StringBuilder("Lucian"));
        
        System.out.println(list.toString());
      

      
    }

    
}
