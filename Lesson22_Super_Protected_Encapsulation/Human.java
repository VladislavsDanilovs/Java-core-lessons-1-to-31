package Lesson22;

public class Human {
    // public Human(String n){
    //     name = n;
    // }

   protected String name = "Kartur";
   protected static int salary = 150;

   protected void work() {System.out.println("work");}
   public static void rest() {System.out.println("rest");}

}


class Student extends Human {

public static void main(String[] args) {
   Student s = new Student();
   System.out.println(s.name); 
   System.out.println(Student.salary); 
   s.work();
   Student.rest();
}

}