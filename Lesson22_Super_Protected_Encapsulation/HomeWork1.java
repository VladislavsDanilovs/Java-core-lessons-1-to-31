package Lesson22;

public class HomeWork1 {

}

class Student777 {
    private StringBuilder name; // ne menee 3 simbolov
    private int grade; // ocenki v intervale ot 1 do 10
    private int course; // kurs ot 1 do 4 vklu4iteljno

    // GETTERS
    public StringBuilder getName() {
        StringBuilder sb1 = new StringBuilder(name);
        System.out.println(sb1);
        return sb1;
    }

    public int getGrade() {

        System.out.println(grade);
        return grade;
    }

    public int getCourse() {

        System.out.println(course);
        return course;
    }

    // SETTERS

    public void setName(StringBuilder sb5) {
        if (sb5.length() >= 3) {
            name = sb5;

        }
    }

    public void setCourse(int a) {
        if (a <= 4 && a >= 1) {
            course = a;

        }
    }

    public void setGrade(int b) {
        if (b <= 10 && b >= 1) {
            grade = b;

        }
    }

    public void showInfo() {
        getName();
        getCourse();
        getGrade();
    }

    // metod showInfo vivodit vsju info o studente ne ispoljzuja peremennie klassa
    // narpjamuju.

}

class TestStudent {
    public static void main(String[] args) {

        Student777 s1 = new Student777();

        s1.setName(new StringBuilder("gj"));
        s1.setCourse(4);
        s1.setGrade(2);

        s1.showInfo();

    }
}