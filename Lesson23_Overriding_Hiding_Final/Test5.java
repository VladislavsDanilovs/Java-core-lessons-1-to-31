package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
       
        Employee2 e = new Teacher2();
        e.sleep();
    }
}

class Food1{}
class Fruits1 extends Food1{}

class Employee2 {

    double salary = 100;
    String name = "Pavlik";



     Food1 eat() {
        System.out.println("eats");
        Food1 f = new Food1();
        return f;
    }
 
        void sleep() {
        System.out.println("sleeps");
    }
}


class Teacher2 extends Employee2 {

    public Fruits1 eat() {
        System.out.println("teacher eats ");
        Fruits1 f = new Fruits1();
        return f;
    }

    int studentQuantity;

        void sleep() {
        System.out.println("teacher sleeps");
    }
}