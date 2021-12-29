package Lesson25;

public class Test6 {
    
public static void main(String[] args) {
    Test30 t1 = new Test30();
   System.out.println(((Test10)t1).a);
}

}


class Test10{

    int a = 5;
    void abc(){
        System.out.println("ok 1");
    }
}

class Test20 extends Test10{

    int a = 10;
    void abc(){
        System.out.println("ok 2");
    }
}

class Test30 extends Test20{

    int a = 15;
    void abc(){
        super.abc();
        System.out.println( "ok 3");
    }
}