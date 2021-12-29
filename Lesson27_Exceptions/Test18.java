package Lesson27;

public class Test18 {

    void abc(){
        System.out.println("Method abc");
        throw new StackOverflowError();
    }
    void def(){
        try{
            abc();
            // return;
        } finally{
            System.out.println("finally");
        }
    }
    

    public static void main(String[] args) {
        Test18 t1 = new Test18();
        t1.def();
    }
}
