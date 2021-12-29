package Lesson29;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Car {
    String model;
    String color;
    int engine;

    Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "model is : " + model + ", color: " + color + ", engine: " + engine;
    }
}

class CarInfo {

    // supplier method
    public static ArrayList<Car> GenerateCar(Supplier<Car> carSupplier) {
        ArrayList<Car> aL = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            aL.add(carSupplier.get());
        }

        return aL;

    }

    // consumer method

    public static void changeCars(Car c1, Consumer<Car> consumer1) {
        consumer1.accept(c1);
    }

    public static void main(String[] args) {
        ArrayList<Car> list1 = GenerateCar(() -> new Car("Pezho", "Blue", 1));
        System.out.println(list1);

        // changeCars(list1.get(0), c1 -> {
        //     c1.color = "green";
        //     c1.model = "Renault";
        //     System.out.println("updated list: " + c1);
        // });

        Consumer <Car> consumer = c2 -> {
            c2.color = "green";
            c2.model = "Renault";
            System.out.println("updated list: " + c2);
        };
        consumer.accept(list1.get(0));
        System.out.println(list1);
    }

}

// class Car{
// String model;
// String color;
// String engine;
// Car(String model, String color, String engine){
// this.model= model;
// this.color = color;
// this.engine = engine;
// }

// public String toString(){
// return "Car model is: "+model+", color: "+color+", engine: "+engine+" | ";
// }
// }

// class CarInfo{
// public static ArrayList<Car> carFactory(Supplier<Car> carSupplier){
// ArrayList<Car> aL = new ArrayList<>();
// for(int i=0; i<3;i++){
// aL.add(carSupplier.get());
// }
// return aL;
// }
// public static void main(String[] args) {
// ArrayList<Car> list1 = carFactory(() -> new Car("Porshe", "metalic", "3.0"));
// System.out.println(list1);
// }
// }

// public class Homework4 {

// }

// class Car{
// String model;
// String color;
// double engine;
// Car(String model, String color, double engine){
// this.model = model;
// this.color = color;
// this.engine = engine;
// }

// public String toString(){
// return "Car model is :"+model + ", car color is :"+color+", car engine is:
// "+engine;
// }
// }

// class CarInfo{

// public static ArrayList<Car> CarFactory(Supplier<Car> carSupplier){
// ArrayList <Car> aL = new ArrayList<>();
// for(int i=0; i<3; i++){
// aL.add(carSupplier.get());
// }

// return aL;
// }

// public static void main(String[] args) {

// ArrayList <Car> list1 = CarFactory(() -> new Car("Nissan", "pathfinger",
// 1.1));
// System.out.println("List1 contains: "+list1);

// }

// }