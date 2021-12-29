package Lesson29;
import java.util.ArrayList;
import java.util.function.*;

public class Test6 {
  
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double averageGrade;
        Student(String name, char sex, int age, int course, double averageGrade) {
        this.name = name;
        this.sex=sex;
        this.age = age;
        this.course=course;
        this.averageGrade=averageGrade;
    }
}

class StudentInfo{
    void printStudent(Student st){

        System.out.println("Imja studenta: "+st.name + ", pol: " +st.sex+", vozrast: "+ st.age+
        ", kurs: "+ st.course + ", srednaja ocenka: "+st.averageGrade);
    }

  void testStudents(ArrayList <Student> aL, Predicate<Student> t){
    for(Student s: aL) {
        if(t.test(s)){
            printStudent(s);
        }

    }

  }

    public static void main(String[] args) {
        ArrayList <Student> list1 = new ArrayList<>();
        Student st1 = new Student ("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student ("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student ("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student ("Petr", 'm', 35, 4, 7);
        Student st5 = new Student ("Marija", 'f', 23, 3, 9.1);
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
        list1.add(st4);
        list1.add(st5); 

        StudentInfo si = new StudentInfo();
        for(Student s: list1){
            System.out.println(s.name);
        }
        System.out.println("-------------------------");
        list1.removeIf(x -> x.name.endsWith("a"));
        for(Student s: list1){
            System.out.println(s.name);
        }
     
    
        // si.testStudents(list1, (Student st)-> {return st.averageGrade > 8.5;});
        // System.out.println("-------------------------------------------");
        // si.testStudents(list1, (Student st)-> {return st.averageGrade < 9;});
        // System.out.println("-------------------------------------------");
        // si.testStudents(list1, (Student st)-> {return st.age > 25;});
        // System.out.println("-------------------------------------------");
        // si.testStudents(list1, (Student st)-> {return st.age < 27;});
        // System.out.println("-------------------------------------------");
        // si.testStudents(list1, (Student st)-> {return st.sex == 'm';});
        // System.out.println("-------------------------------------------");
        // si.testStudents(list1, (Student st)-> {return st.averageGrade > 7.2 && st.age<23 && st.sex == 'f';});

    }
}


