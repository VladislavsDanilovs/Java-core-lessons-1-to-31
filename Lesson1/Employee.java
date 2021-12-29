package Lesson1;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    
    private Employee(int id3, String surname3){
     this(id3, surname3, 17, 777.00, "IT");

        }

   Employee(String department2){
    this(22, "Max", 18, 71.00, "Eco");
   
        }
    
    public Employee(int id1, String surname1, int age1, double salary1, String department1){
    id = id1;
    surname = surname1;
    age = age1;
    salary = salary1;
    department = department1;
    }

    public void showSalary() {
        System.out.println("Your salary is: " + salary);
    }

    public void showSurname() {
        System.out.println("Your surname is: " + surname);
    }

    public void showid() {
        System.out.println("Your id is: " + id);
    }


    public void info(){
        System.out.println("Familija: " + surname+ " Vozrast: " + age + " Zarplata: " + salary);
    }
    
    public double salaryIncrease(double a) {
        double result = a * 2;
        return result;

    }

}

class EmployeeTest {

    public static void main(String[] args){

    Employee e1 = new Employee(1, "David", 19, 500, "Lidl");
    Employee e2 = new Employee(2, "Lucian", 49, 340, "Lidl");

    
    e1.info();
    e2.info();

    // double newSalary1 = e1.salaryIncrease(e1.salary);
    // double newSalary2 = e2.salaryIncrease(e2.salary);

   


    // System.out.println(newSalary1);
    // System.out.println(newSalary2);

    e1.showSalary();;
    e1.showSurname();
    e1.showid();

    }



}