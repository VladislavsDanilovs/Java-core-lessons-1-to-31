package Lesson11;

public class Student {
    String name;
    int course;
    double mark;

    Student(String name, int course, double mark) {
        this.name = name;
        this.course = course;
        this.mark = mark;
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1) {
        s1.name = "Pavlik";
    }

   
}

    class StudentTest {

        public static void main(String[] args) {
            Student st1 = new Student("Ivan", 3, 3.4441);
            Student st2 = new Student("Ivan", 3, 3.444);

            StudentTest st3 = new StudentTest();
            st3.compareStudent(st1, st2);

            st3.advancedCompare(st1, st2);
    
            
            // Student.changeName(st1, st2);
            // System.out.println(st2.name);
        }

    

        public void compareStudent(Student s1, Student s2) {

            if (s1.name.equals(s2.name) && s1.course == s2.course && s1.mark == s2.mark) {
                System.out.println("Students parametrs are equal");
            }
            else {
                System.out.println("Students parametrs are different"); 
            }
        }

        public void advancedCompare(Student s1, Student s2) {
            if (s1.name.equals(s2.name)) {
                System.out.println("Students names are equal");

                if (s1.course == s2.course) {
                    System.out.println("Students courses are equal");

                    if (s1.mark == s2.mark) {
                        System.out.println("Students marks are equal");
                    }
                    else {
                        System.out.println("Students marks are different");
                    }
                } else {
                    System.out.println("Students courses are different");
                }



            } else {
                System.out.println("Students names are different"); 
            } 
 
        }


    }