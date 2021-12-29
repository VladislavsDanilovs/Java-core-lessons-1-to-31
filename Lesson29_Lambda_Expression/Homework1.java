package Lesson29;
import java.util.ArrayList;
import java.util.function.*;


class Student777{
    String name;
    int age;
    int course;
    Student777(String name, int age, int course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

class StudentInfo1{
    public void printStudent(Student777 s1){
        System.out.println("name: "+s1.name+ ", age: "+s1.age+", course: "+s1.course);
    }
    public void GenerateStudent(ArrayList<Student777> aL, Predicate<Student777> pre){
   
        for (Student777 s : aL){
            if (pre.test(s)){
                printStudent(s);
            }
        }

    }
    public static void main(String[] args) {
        
        Student777 s1 = new Student777("Pavlik", 21, 1);
        Student777 s2 = new Student777("Masim", 19, 5);
        Student777 s3 = new Student777("Martur", 30, 2);

        ArrayList <Student777> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        StudentInfo1 si = new StudentInfo1();

        si.GenerateStudent(list1, (Student777 s) -> {return s.age > 20;});

    }

}

























// public class Homework1 {
    
// }

// class Student7{
//     String name;
//     int age;
//     Student7(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
// }

// class StudentChecking{

//     void StudentParamPrint(Student7 st1){
//         System.out.println("Student name is: "+st1.name+", and his age is: "+st1.age);
//     }

//     void studentChinese(ArrayList <Student7> aL, Predicate<Student7> p1){
//         for(Student7 s1: aL){
//             if(p1.test(s1)){
//                 StudentParamPrint(s1);
//             }
//         }
//     }



//     public static void main(String[] args) {
//         ArrayList <Student7> list1 = new ArrayList<>();

//         Student7 st1 = new Student7("Pavlik", 11);
//         Student7 st2 = new Student7("Maxim", 29);
//         Student7 st3 = new Student7("Petr", 47);

//         list1.add(st1);
//         list1.add(st2);
//         list1.add(st3);
        
//         StudentChecking sc1 = new StudentChecking();
//         sc1.studentChinese(list1, (Student7 st) -> {return st.age > 25;});

//     }
// }
