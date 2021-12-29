package Lesson1;

public class Employee1 {

    Employee1(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    Employee1 (String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }
    
    Employee1(int id4, String surname4, int age4, double salary4, String department4) {
       id = id4;
       surname = surname4;
       age = age4;
       salary = salary4;
       department = department4;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;


}

class EmployeeTest1 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee1 emp2 = new Employee1("Petrov", 30);
        System.out.println(emp2.department);
        Employee1 emp3 = new Employee1(2, "Sidorov",40, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
