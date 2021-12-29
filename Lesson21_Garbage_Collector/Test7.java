package Lesson21;

public class Test7 {

    public void abc(int a, double b) {
        System.out.println("hi");
    }

    public void abc( double b, int a) {
        System.out.println("bye");
    }
 
    

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1, 2.0);
    }
}
