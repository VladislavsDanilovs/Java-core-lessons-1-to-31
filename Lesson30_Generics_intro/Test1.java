package Lesson30;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // ArrayList <Number> aL = new ArrayList<>();
    
    Info <String> info1 = new Info <> ("Privet");
    System.out.println(info1);

    String s = info1.getValue();
    System.out.println(s);

    Info <Integer> info2 = new Info <> (27);
    System.out.println(info2);
    int i = info2.getValue();
    
    }

    // public void abc(Info <String> info) {
    //     String s = info.getValue();
    // }
    // public void abc(Info <Integer> info) {
    //     Integer e = info.getValue();
    // }
}

class Info <T> {
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "[(" + value + ")]";
    }
    public T getValue(){
        return value;
    }
}

// class Parent {
//     public void abc(Info<String> info) {
//         String s = info.getValue();
//     }
// }

// class Child extends Parent{
//     public void abc(Info<Integer> info) {
//         Integer i = info.getValue();
//     }
// }
