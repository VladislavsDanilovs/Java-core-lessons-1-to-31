package Lesson29;
import java.util.ArrayList;

public class Test1 {


    
}

// class Student {
//     String name;
//     char sex;
//     int age;
//     int course;
//     double averageGrade;

//     Student(String name, char sex, int age, int course, double averageGrade) {
//         this.name = name;
//         this.sex=sex;
//         this.age = age;
//         this.course=course;
//         this.averageGrade=averageGrade;
//     }
// }

// class StudentInfo{
//     void printStudent(Student st){

//         System.out.println("Imja studenta: "+st.name + ", pol: " +st.sex+", vozrast: "+ st.age+
//         ", kurs: "+ st.course + ", srednaja ocenka: "+st.averageGrade);
//     }

//     void printStudentsOverGrade(ArrayList <Student> aL, double averageGrade) {
//         for(Student s: aL){
//             if(s.averageGrade > averageGrade){
//                 printStudent(s);
//             }
//         }
//     }

//     void printStudentsUnderGrade(ArrayList <Student> aL, double averageGrade) {
//         for(Student s: aL){
//             if(s.averageGrade < averageGrade){
//                 printStudent(s);
//             }
//         }
//     }

//     void printStudentsOverAge(ArrayList <Student> aL, int age) {
//         for(Student s: aL){
//             if(s.age > age){
//                 printStudent(s);
//             }
//         }
//     }
    
//     void printStudentsUnderAge(ArrayList <Student> aL, int age) {
//         for(Student s: aL){
//             if(s.age < age){
//                 printStudent(s);
//             }
//         }
//     }

//     void printStudentsBySex(ArrayList <Student> aL, char sex) {
//         for(Student s: aL){
//             if(s.sex == sex){
//                 printStudent(s);
//             }
//         }
//     }

//     void printStudentsMixConditions(ArrayList <Student> aL, double averageGrade, int age, char sex) {
//         for(Student s: aL){
//             if(s.averageGrade > averageGrade && s.age < age && s.sex == sex){
//                 printStudent(s);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList <Student> list1 = new ArrayList<>();
//         Student st1 = new Student ("Ivan", 'm', 22, 3, 8.3);
//         Student st2 = new Student ("Nikolaj", 'm', 28, 2, 6.4);
//         Student st3 = new Student ("Elena", 'f', 19, 1, 8.9);
//         Student st4 = new Student ("Petr", 'm', 35, 4, 7);
//         Student st5 = new Student ("Marija", 'f', 23, 3, 9.1);
//         list1.add(st1);
//         list1.add(st2);
//         list1.add(st3);
//         list1.add(st4);
//         list1.add(st5); 

//         StudentInfo si = new StudentInfo();
//         si.printStudentsOverGrade(list1, 8.5);
//         System.out.println("____________________________________________________________________________");
//         si.printStudentsUnderGrade(list1, 9);
//         System.out.println("____________________________________________________________________________");
//         si.printStudentsOverAge(list1, 25); 
//         System.out.println("____________________________________________________________________________");
//         si.printStudentsUnderAge(list1, 27);
//         System.out.println("____________________________________________________________________________");
//         si.printStudentsBySex(list1, 'm');
//         System.out.println("____________________________________________________________________________");
//         si.printStudentsMixConditions(list1, 7.2, 23, 'f');


//     }
// }