// package Lesson29;

// import java.util.function.Supplier;
// import java.util.function.Consumer;
// import java.util.*;

// public class Test9 {

// }

// class Car {
//     String model;
//     String color;
//     double engine;

//     Car(String model, String color, double engine) {
//         this.model = model;
//         this.color = color;
//         this.engine = engine;
//     }

//     public String toString() {
//         return "Our Car is " + model + ", color is: " + color + "and engine = " + engine;
//     }

// }

// class Test10 {
//     public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
//         ArrayList<Car> al = new ArrayList<>();
//         for (int i = 0; i < 3; i++) {
//             al.add(carSupplier.get());
//         }
//         return al;
//     }

//     public static void changeCar(Car car, Consumer<Car> consumer) {
//         consumer.accept(car);

//     }

//     public static void main(String[] args) {
//         ArrayList<Car> ourCars = createThreeCars(() -> new Car("BMW X5", "silver", 1.2));
//         System.out.println("ourCars: " + ourCars);
        
//         //pervij variant ispolzovanija consumer:
//         changeCar(ourCars.get(0), car -> {
//             car.color = "red";
//             car.engine = 2.4;
//             System.out.println("Updated car: " + car);
//         });

//             // vtoroj variant napisanaja consumer:
//             //no v osnovnom ispolzujut pervij variant
//         Consumer<Car> consumer = car -> {
//                 car.color = "red";
//                 car.engine = 2.4;
//                 System.out.println("Updated car: " + car);
//             };
//             consumer.accept(ourCars.get(0));
//         System.out.println("ourCars: " + ourCars);
//     }
// }
