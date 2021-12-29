package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Teacher1();
        e.eat();

   
    }

}

class Food{}
class Fruits extends Food{}



class Employee1 {

    double salary = 100;
    String name;
    int age;
    int experience;
    private int a = 5;

     Food eat() {
        System.out.println("tastes good");
        Food f = new Food();
        return f;
    }

    void sleep() {
        System.out.println("zzzzzzzzzz.......");
    }
}


class Teacher1 extends Employee1 {
    @Override
    public Fruits eat() {
        System.out.println("eats ");
        Fruits f = new Fruits();
        return f;
    }

    int studentQuantity;

}



class A{

Employee objectCreation() {
    return new Employee();
    }
}

class B extends A {
    Teacher objectCreation() {
        System.out.println("ok");
        return new Teacher();
        }
}