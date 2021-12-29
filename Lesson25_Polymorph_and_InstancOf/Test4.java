package Lesson25;

import javax.print.Doc;

public class Test4 {

    public static void main(String[] args) {
        Help_able h = new Doctor();

        Employee1 emp = new Doctor1();
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Employee1 emp4 = new Employee1();

        Employee1 [] array = {emp1, emp2, emp3, emp4};
         for(Employee1 e : array){
             if (e instanceof Driver1){
                 System.out.println(((Driver1)e).carName);
                 ((Driver1)e).drive();
             }
         }
        // Doctor1 d1 = (Doctor1)emp1;

        h.help();


        ((Doctor1)emp).help();


        System.out.println(((Doctor1)emp1).specialization);
    }

}

class Employee1 {

    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("eats");
    }

    void sleep() {
        System.out.println("zzzzzzzzzz.......");
    }
}

class Doctor1 extends Employee1 implements Help_able1 {

    String specialization = "Hirurg";

    void heal() {
        System.out.println("take a pill");
    }

    public void help(){
        System.out.println("Doctor okazivaet pomosh");
    }

}

class Teacher1 extends Employee1 {

    int studentQuantity;

}

class Driver1 extends Employee1 {

    String carName = "fiat";

    void drive() {
        System.out.println("120km/h in city");
    }
}

interface Help_able1{

void help();

}