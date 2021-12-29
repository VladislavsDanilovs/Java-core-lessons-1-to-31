package Lesson24;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable {
    public void jump(){
        System.out.println("human jumps");
    }

}

class Animal implements Jumpable {
    public void jump(){
        System.out.println("animal jumps");
    }
}

interface Jumpable{

    void jump();


}

interface A2 {
    void abc();
}

interface B2 extends A2,Jumpable {
    void def();
}

abstract class D implements A2,B2{}