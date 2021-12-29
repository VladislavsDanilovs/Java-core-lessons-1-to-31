package Lesson30;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        
        
        
        
        
        
        
        
        
        list1.add(10);
        list1.add(77);
        list1.add(15);
        int a = GenMethod.getSecondElement(list1);
        System.out.println(a);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Food");
        list2.add("Materials");
        list2.add("Drinks");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> aL){
        return aL.get(1);
    }
}
