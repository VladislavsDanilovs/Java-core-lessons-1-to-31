package Lesson25;

public class Test7 {

    public static void main(String[] args) {
        // byte b = 10;
        // int a = b;
        // byte b2 = 127;
        // short s1 = 5000;
        // int i1 = 3;
        // short s2 = (short)i1;

        // char c10 = (char)-8;


        int i = 5;
        long l = 10;

        int l2= (int) (i*l);
        System.out.println(i+l);

        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);

        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b + s + c); // vse konvertiruetsja v int
        System.out.println(b++); //unarnie operatori ne konvr v int
        System.out.println(c--);


        byte b2 = 10;
        float f2 = 7;

        double d2 = 2.0;
        System.out.println(b2+f2-d2);

        double d10 = 3.14;
        float f10 = (float)6.28;

    }
}
