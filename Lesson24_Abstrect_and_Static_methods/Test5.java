package Lesson24;

public class Test5 {
    
}

interface I1 {

    default void abc() {System.out.println("this is abc");}
    static void def(){
        System.out.println("Static method 1");
    }
}

abstract class O{}


interface I2 {
    static void def(){
        System.out.println("Static method 2");
    }
}
class R extends O implements I1  {
    static I2 method1(I2 i) { return new D2();
       
    }
    public static void main(String[] args) {
        I2 i = new D2();
       method1(i);
    }
}

class D2 implements I2 {}

// class Z2 implements I1 {
//     public void abc(){
//         System.out.println("Eto metod abc");
//         Z2 z = new Z2();
//         z.abc();
//         z.def();
//         z.ghi();
//     }
// }
