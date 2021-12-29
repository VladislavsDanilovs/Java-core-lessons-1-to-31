package Lesson8.Lesson8_1;

class homeWork777 {
    public static final double pi = 3.14;

    //Task lesson 8.
    /*
    Task description:
    Use pi constant in non-static method, which takes in parameter value of radius and calculates area of circle
    S = pi * radius*radius

    Also use this constant in static method, which takes in paramets value of radius and calculate circumference
    S = 2 * pi * r

    Also create one more non static method, which takes in parametr value of radius and display information aboud radius, circle area and circumference

    use all 3 methods in second class

    */



    public double areaOfCircle(double radius) {
        return pi * radius* radius;
    }

    public static double circumference(double radius) {
        return 2 * pi * radius;
    }

    public void showInfo(double radius){
        System.out.println("Value of radius is: "+radius+"; Area of circle is: " +areaOfCircle(radius) + "; The circumference is: "+circumference(radius));
    }
}

class homeWork777Test {
    public static void main(String[] args) {
        homeWork777 h2 = new homeWork777();
        System.out.println("hello");
        System.out.println(h2.areaOfCircle(20));
        System.out.println(homeWork777.circumference(10));
        h2.showInfo(10);

    }
}


