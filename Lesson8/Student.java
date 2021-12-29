package Lesson8;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {

        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + "created");
    }

    public static void showCount() {
        System.out.println("Created students number is " + count);
    }

    public void showInfo() {
        System.out.println("Welcome!");
    }

    void abc() {
     a++;
     count++;    
    }

    static void abcd() {
        
    }

    public static void main(String[] args) {

    }
}

