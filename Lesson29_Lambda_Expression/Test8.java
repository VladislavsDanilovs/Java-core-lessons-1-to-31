package Lesson29;

public class Test8 {
    public static void main(String[] args) {
        
    }   
    // static double abc() {return 3.14}; 
}



interface I {
 void abc();

 default void def(){}
 default void def2(){}
 static void def3(){}
}