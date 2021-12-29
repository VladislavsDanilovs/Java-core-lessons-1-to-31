package Lesson26;

public class Test5 {

    {

        System.out.println("Eto init bock 3"); // initialization block

    }

    Test5() {
        System.out.println("Eto konstruktor 1");
    }

    Test5(int a) {
        this();
        System.out.println("Eto konstruktor 2");
    }

    String s1;
    {

        System.out.println("Eto init bock 1"); // initialization block

    }

    static {

        System.out.println("Eto static init bock"); // static initialization block

    }

    {

        System.out.println("Eto init bock 2"); // initialization block

    }

    static {

        System.out.println("Eto static init bock"); // static initialization block

    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }

}
