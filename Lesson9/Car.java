package Lesson9;

public class Car {

    public static int ab = 10;
    public int z = 5;
   

    String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
 
        int a = 5;
        this.color = color;
        this.engine = engine;
    }

    void changeColor(String color) {
        color = color;
        System.out.println(this.color);
    }

        public static void main(String[] args) {
            Car c = new Car("red","v6");
            System.out.println(c.color);
            c.changeColor("black");
            System.out.println(c.color);
        }
}

