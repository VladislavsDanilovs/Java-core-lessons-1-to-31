package Lesson23;

public class Test2 {

    public static void main(String[] args) {
        // Doctor d = new Doctor();
        // Teacher t = new Teacher();
        // Driver dr = new Driver();
        // Employee e = new Employee();


        Employee emp1 = new Doctor(); 
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
      

        Employee emp2 = new Teacher(); 
        Employee emp3 = new Driver();

        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();
        System.out.println(d2.experience);
        d2.eat();
        d2.sleep();
        d2.heal();


        Employee emp4 = new Xirurg();
    }

}

class Employee extends java.lang.Object {

    double salary = 100;
    String name;
    int age;
    int experience;
    private int a = 5;

    void eat() {
        System.out.println("tastes good");
    }

    void sleep() {
        System.out.println("zzzzzzzzzz.......");
    }
}

class Doctor extends Employee {

    String specialization;

    void heal() {
        System.out.println("take a pill");
    }
}


class Xirurg extends Doctor {
    String skalpel;
    void operation(){};
}

class Teacher extends Employee {

    int studentQuantity;

}

class Driver extends Employee {

    String carName;

    void drive() {
        System.out.println("120km/h in city");
    }
}