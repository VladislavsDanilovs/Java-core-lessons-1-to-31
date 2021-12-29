package Lesson1;


public class Student {

    int ticket;
    String name = new String();
    String surname = new String();
    int yearOfStudy;
    double math;
    double economic;
    double german;

    Student(int ticket1, String name1, String surname1, int yearOfStudy1, double math1, double economic1, double german1){
        ticket = ticket1;
        name = name1;
        surname = surname1;
        yearOfStudy = yearOfStudy1;
        math = math1;
        economic = economic1;
        german = german1;

    }

    Student(int ticket2, String name2, String surname2, int yearOfStudy2){
    this(ticket2, name2, surname2, yearOfStudy2, 0.0, 0.0, 0.0);

    }

    Student(){
        this(0, null, null, 0,0.0, 0.0, 0.0);
    
        }
}

class StudentTest { 

    public static void main(String[] args) {



        Student t1 = new Student(69, "Meison", "Star", 2, 7.7, 3.4, 5.5);
        Student t2 = new Student(71, "Reison", "Star", 12);
        Student t3 = new Student();

        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println();


        Student Mark = new Student();
        StudentTest Test = new StudentTest();
        Student numberOf = new Student();
        Student personalData = new Student();
    

        personalData.name = "Maxim";
        personalData.surname = "Pavel";

        
        numberOf.ticket = 1;

        Mark.math = 5;
        Mark.economic = 4;
        Mark.german = 7;

        double h1 = Test.averageMark(Mark.economic,Mark.german,Mark.math);
        System.out.println("Pavel average mark is: " + h1);
        
    }
        
        double averageMark(double a, double b, double c) {
        double result = (a + b + c)/3;
        return result;
    }
}


