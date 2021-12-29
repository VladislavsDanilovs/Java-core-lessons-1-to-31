package Lesson25;

public class Test1 {
    public static void main(String[] args) {

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();        

        Employee [] array2 = {emp1, emp2, emp3};

   
        // for(Employee emp : array2){
        //     emp.work();
        // }

            System.out.println(emp1 instanceof Teacher);

    }
}

abstract class Employee {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {

    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {

    public void help() {
        System.out.println("Driver helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {

    public void help() {
        System.out.println("Doctor helps");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}