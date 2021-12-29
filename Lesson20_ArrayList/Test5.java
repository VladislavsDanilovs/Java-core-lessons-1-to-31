package Lesson20;

import java.util.ArrayList;

public class Test5 {
    

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add(new String("Petrov"));
        list.add(new String("Maxim"));
        list.add(new String("Pavlik"));
        list.add(new String("Maxim"));
   

        for(String s : list) {
        System.out.println(s+" ");
        }
        System.out.println(list.lastIndexOf(new String("Maxim")));


        System.out.println();
        System.out.println(list.size());
      
        System.out.println(list.contains("Maxim"));

        System.out.println(list.toString());

        }

    }

