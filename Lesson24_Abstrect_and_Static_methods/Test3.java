package Lesson24;

public class Test3 {

public static void main(String[] args) {
    Help_able h = new Driver();
    Swim_able s = new Driver();
    Employee e = new Driver();
    System.out.println(h.a);
    h.FireTushit("water");
}

}

class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("eats");
    }

    void sleep() {
        System.out.println("zzzzzzzzzz.......");
    }
}


class Teacher extends Employee implements Help_able{

    public void firstAid(){
        System.out.println("Help teacher");
    }
    public void FireTushit(String s){
        System.out.println("fire"+ s);
    }

    int studentQuantity;

}

class Driver extends Employee implements Help_able, Swim_able{

    public void swim(){
        System.out.println("swim!");
    }

    public void firstAid(){
        System.out.println("Help driver");
    }
    public void FireTushit(String s){
        System.out.println("put out the fire "+ s);
    
    }

    String carName;

    void drive() {
        System.out.println("120km/h in city");
    }
}

interface Help_able{
    public final static int a = 10;
    void firstAid();
    void FireTushit(String predmet);
}

interface Swim_able{
void swim();

}