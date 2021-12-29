package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Homework2 {

}

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public void printEmployee(Employee emp) {
        System.out.println("Employees name is: " + emp.name + ", employee is from " + emp.department + " department"
                + ", and " + emp.name + "'s salary is: " + emp.salary);
    }

    void Employeesfiltration(ArrayList <Employee> aL, Predicate<Employee> pre){
        for(Employee e1 : aL){
            if(pre.test(e1)){
                printEmployee(e1);
            }
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", "N", 1250.99);
        Employee emp2 = new Employee("Maksim", "H", 50.1);
        Employee emp3 = new Employee("Aleshka", "IT", 70.1);
        Employee emp4 = new Employee("Veronika", "IT", 2500);
        Employee emp5 = new Employee("Eduard", "UC", 449.99);

        ArrayList <Employee> list1 = new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        list1.add(emp5);
        
        TestEmployee t1 = new TestEmployee();
        t1.Employeesfiltration(list1, (Employee e) -> {return e.department.equals("IT") && e.salary > 200;});
        t1.Employeesfiltration(list1, (Employee e) -> {return e.name.startsWith("E") && e.salary < 450;});
        t1.Employeesfiltration(list1, (Employee e) -> {return e.name.equals(e.department);});
    }
}