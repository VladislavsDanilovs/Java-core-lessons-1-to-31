package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal a = new Tiger();
        System.out.println();
        a.abc();
        a.def();
    }
}


class Animal{
    int a = 5;
    static int b = 10;
    void abc() {System.out.println("non-static Method from class Animal");}
    static void def() {System.out.println("static Method from class Animal");}
    }

    class Tiger extends Animal{
        int a = 15;
        static int b = 20;
        void abc() {System.out.println("non-static Method from class Tiger");}
        static void def() {System.out.println("static Method from class Tiger");}
        }