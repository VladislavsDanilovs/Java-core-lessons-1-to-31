package Lesson13;

public class Test1 {

    

}


class Student {

    int grade;
    Student (int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);
        
        switch (st1.grade) {
            case 2:
                System.out.println("Bad mark"); 
                break;
            case 3:
                System.out.println("Good!");
            case 5:
                System.out.println("Excellent");
            default: 
                System.out.println("Incorrect data");
        }


    }
  
}