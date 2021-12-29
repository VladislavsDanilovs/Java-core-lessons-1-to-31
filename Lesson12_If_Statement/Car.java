package Lesson12;

public class Car {
    int engine;
    int doorCount;
    
    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}


class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(25, 2);
        Car c2 = new Car(5, 2);




        if(c1.engine>c2.engine) {

            if(c1.doorCount>c2.doorCount) {
                System.out.println("Power of motor and cars door quantity is bigger");}

            else {
            System.out.println("Power of motor and cars door quantity is less");
                } 
             }
        else {
            System.out.println("Another option");
        }





    }
}