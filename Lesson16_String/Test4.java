package Lesson16;

public class Test4 {
    
}

class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(1000, false);
        System.out.println("Info: "+emp.isManager + emp.salary);
    }
}