package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList <> ();
        list.add(new StringBuilder("goodbye"));
        list.add(new StringBuilder("hi"));
        list.add(new StringBuilder("ok"));

        list.add(0,new StringBuilder("hello"));


        // for(String s:list){
        //     System.out.print(s + " ");
        // }

        System.out.println();

        ArrayList <StringBuilder> list2 = new ArrayList <> ();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Maxim"));
     
      
        list.addAll(0, list2);
  
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list2.get(1).append("!");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        list.clear();
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    } 
}
