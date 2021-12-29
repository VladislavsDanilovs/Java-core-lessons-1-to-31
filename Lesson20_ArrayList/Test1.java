package Lesson20;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        Car c = new Car();
        list.add(c);
        Student s =  new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));


        ArrayList <String> list2 = new ArrayList <>(30);
        ArrayList <String> list5 = new ArrayList <>(list2);

        System.out.println();

        list2.add("goodbye"); 
        List <StringBuilder> list3 = new ArrayList <>();
        list3.add(new StringBuilder("..."));

       

    }
    
}


class Car{}
class Student{}