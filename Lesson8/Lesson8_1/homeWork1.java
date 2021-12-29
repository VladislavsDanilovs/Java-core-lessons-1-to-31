package Lesson8.Lesson8_1;

public class homeWork1 {
    //Create 2 static methods. First one multiplies 3 numbers from method parametrs and returns result.
    //Second methods divides first number from method parametr to second number and returning nothing, only displaying info
    //In second class try to use this methods 2 times.

    public static int firstMethod(int a, int b, int c) {
        
        int multiplication = a * b * c;
        return multiplication;
    }

    public static void secondMethod(double a, double b) {
        double dividingResult = a / b;
        double Modulus = a % b;
        System.out.println("Your result dividing : " +a+ " to number : " +b+ " is equals to: "+dividingResult+ " and remainder of the division is: "+Modulus);
    }
    public static void main(String[] args) {
        System.out.println(firstMethod(1,1,7));
        secondMethod(25, 2);
    }
 
}

class homeWork2 {

    public static void main(String[] args) {
        System.out.println(homeWork1.firstMethod(5,5,5));
        System.out.println(homeWork1.firstMethod(7,7,7));
     

        homeWork1.secondMethod(97,69);
        homeWork1.secondMethod(49,59);

    }

}
