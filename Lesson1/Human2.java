package Lesson1;

public class Human2 {

    String name;
    int id;
    int age;
    Car777 car;
    BankAccount777 balance;

    void info() {
        System.out.println("Name: " + name + " Car color: " + car.engine + " Car engine: " + car.motor+ " Balance: " + balance.balance);
    }



}

class HummanTest2 {
 public static void main(String[] args){

    Human2 h = new Human2();
    h.car = new Car777("Black", "V95");
    h.balance= new BankAccount777(1, 777);
    h.name = "Patrik";


    h.info();


 }

}

class Car777{

    Car777(String e, String m){
        engine = e;
        motor = m;
    }
    String engine;
    String motor;
}

class BankAccount777 {
    BankAccount777(int i, int b){
    id = i;
    balance = b;

    }
    int id;
    int balance;    

}