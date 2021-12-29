package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increase(double a) {
        a*=2;
        return a;
    }

    public double increaseSalary() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Pavlik", 320.1);

        System.out.println(emp1.salary);

        double newSalary = emp1.increase(emp1.salary);
        double newSalaryV2 = emp1.increaseSalary();
        double newSalaryV3 = emp1.increaseSalary();



        System.out.println(newSalary);
    

        System.out.println(newSalaryV2);
        System.out.println(newSalaryV3);

    }
}