package Lesson27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {

    public static void main(String[] args) {
        // Animal2 a = new Mouse();

    }
    
}

class Animal2 {
    Animal2() throws FileNotFoundException {

    }

}

class Mouse extends Animal2{

    Mouse() throws Exception {
      
    }
}

class Human{
    String name;
    int age;
    Human(String name, int age) throws Exception{
        if(age<0) {
            throw new Exception("Invalid age");
        }
        this.name = name;
        this.age = age;
    }
}