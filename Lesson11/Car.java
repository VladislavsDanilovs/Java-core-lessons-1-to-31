package Lesson11;

public class Car {
    String color;
    String engine;
    public int numberOfDoors;

    Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
}

class CarTest {

    
    public int changeNumberOfDoors(Car c, int d){
        return c.numberOfDoors = d;
    }


    public void colorChange(Car c1, Car c2) {
        String c0 = c1.color;
        c1.color = c2.color;
        c2.color = c0;
    }

 

    public static void main(String[] args) {
        Car t0 = new Car("Red", "V1.2", 77);
        Car t1 = new Car("Green", "V2.9", 69);
        CarTest t2 = new CarTest();

  
       
        System.out.println(t0.color);
        System.out.println(t1.color);
        System.out.println();
        t2.colorChange(t0, t1);
        System.out.println(t0.color);
        System.out.println(t1.color);
    

     
        System.out.println("Existing number of doors car1: "+ t0.numberOfDoors);
        t2.changeNumberOfDoors(t0, 4);
        System.out.println("Updated number of doors car1: "+ t0.numberOfDoors);

        System.out.println();
          
        System.out.println("Existing number of doors car1: "+ t1.numberOfDoors);
        t2.changeNumberOfDoors(t1, 2);
        System.out.println("Updated number of doors car1: "+ t1.numberOfDoors);

   


        // System.out.println(t1.numberOfDoors.getClass().getSimpleName());
    }
}
