package Lesson1;

public class Human {

    String name;
    car3 car;
    BankAccount1 bA;

    void info() {
        System.out.println("Name: " + name + " car color: " +car.color + " balance: " + bA.balance + " motor: " +car.engine);
    }
}

class HumanTest {

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new car3("red", "V25");
        h.bA = new BankAccount1(18, 200.4);
        h.info();
        

    }
}
class car3{
car3(String c, String e) {
    color = c;
    engine = e;
}
    String color;
    String engine;
}

class BankAccount1 {
    BankAccount1(int id2, double balance2) {
        id = id2;
        balance = balance2;


    }
    int id;
    double balance;
}