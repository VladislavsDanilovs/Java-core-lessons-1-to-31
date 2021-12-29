package Lesson24;

public class Test1 {

}
 
class A {

    String s = "Hello";

    void abc(){System.out.println("???");}

}

class B extends A{
    String s = "Bye";
    void abc(){System.out.println("!!!");}
    String k2 = super.s;
}

class C extends B {
    String k = super.s;
public static void main(String[] args) {
    C c1 = new C();
    B b1 = new C();
    A a1 = new A();
  
    System.out.println(a1.s);
 

}

}