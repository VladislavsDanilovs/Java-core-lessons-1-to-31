package Lesson7_1;

public class Class3 {
    public static void main(String[] args) {
        Lesson7.Employee emp = new Lesson7.Employee(500);
        System.out.println(emp.salary);
        emp.doubleSalary();

        Lesson1.Employee emp1 = new Lesson1.Employee(1, "Maxfeld", 25, 777.77, "IT");
        
        emp1.info();
        System.out.println(emp1.salaryIncrease(666));
        emp1.showSurname();
    }
}
