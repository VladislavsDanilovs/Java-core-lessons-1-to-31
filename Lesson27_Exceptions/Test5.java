package Lesson27;

public class Test5 {
    static void abc(){
        System.out.println("Method abc works");
        abc();
    }
    public static void main(String[] args) {
        abc();
    }
}
