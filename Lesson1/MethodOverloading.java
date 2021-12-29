package Lesson1;

public class MethodOverloading {
    int i;

    void show(int i) {
        System.out.println(i);
    }
    
    void show(boolean b1) {
        System.out.println(b1);
    }


    void show(String s1) {
        System.out.println(s1);
    }

    void show(String s, int a) {
        System.out.println("String : " + s + " int: " +a);
    }


    
    void show(int a, String s) {
        System.out.println("good job!");
    }
}


class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;

        mO.show(b);

        String s="Hello";
        mO.show (s);

        mO.show(10,"Hi");
    }
}