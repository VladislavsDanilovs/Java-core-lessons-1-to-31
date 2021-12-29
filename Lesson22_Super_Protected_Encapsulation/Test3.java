package Lesson22;

public class Test3 {

    void uvelichZP(Employee e) {
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {
        Doctor coc = new Doctor();
        coc.name = "Ivan";
        coc.age = 50;
        coc.experience= 1;
        coc.eat();
        coc.sleep();
        coc.specialization = "Paramedic";
    }
}

class Employee {

    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("pizza tastes good");
    }

    void sleep() {
        System.out.println("zzzzzzzzzz.......");
    }
}

class Doctor extends Employee {

    String specialization;

    void heal() {
        System.out.println("take a pill ");
    }




}

class Xirurg extends Doctor {
    String skalpel;
    void operation(){};
}

class Teacher extends Employee {

    int studentQuantity;

}

class Driver {

    String carName;

    void drive() {
        System.out.println("brrr**");
    }
}
