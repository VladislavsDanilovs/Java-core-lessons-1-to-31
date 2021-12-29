package Lesson29;
import java.util.ArrayList;


// public class Test2 {
    
// }

// class Student {
//     String name;
//     char sex;
//     int age;
//     int course;
//     double averageGrade;
//         Student(String name, char sex, int age, int course, double averageGrade) {
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

//   void testStudents(ArrayList <Student> aL, StudentChecks sc){
//     for(Student s: aL) {
//         if(sc.test(s)){
//             printStudent(s);
//         }
//     }

//   }

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
//         FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//         FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//         FindStudentsOverAge fsoa = new FindStudentsOverAge();
//         FindStudentsUnderAge fsua= new FindStudentsUnderAge();
//         FindStudentsBySex fsbs= new FindStudentsBySex();
//         FindStudentsMixConditions fsmc= new FindStudentsMixConditions();
        
//         si.testStudents(list1, fsog);
//         System.out.println("-------------------------------------------");
//         si.testStudents(list1, fsug);
//         System.out.println("-------------------------------------------");
//         si.testStudents(list1, fsoa);
//         System.out.println("-------------------------------------------");
//         si.testStudents(list1, fsua);
//         System.out.println("-------------------------------------------");
//         si.testStudents(list1, fsbs);
//         System.out.println("-------------------------------------------");
//         si.testStudents(list1, fsmc);

//     }
// }

// interface StudentChecks{
//     boolean test(Student s);
// }

// class FindStudentsOverGrade implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return s.averageGrade > 8.5;
//     }
// }

// class FindStudentsUnderGrade implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return s.averageGrade < 9;
//     }
// }

// class FindStudentsOverAge implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return s.age > 25;
//     }
// }

// class FindStudentsUnderAge implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return s.age < 27;
//     }
// }

// class FindStudentsBySex implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return s.sex == 'm';
//     }
// }

// class FindStudentsMixConditions implements StudentChecks{
//     @Override
//     public boolean test(Student s){
//         return (s.averageGrade > 7.2 &&
//         s.age < 23 && 
//         s.sex == 'f');
//     }
// }