package Lesson25;

public class Test5 {

    public static void main(String[] args) {
        String [] array1 = {"hello", "bye"};

        Object [] array2 = array1;
        String [] array3 = (String[])array2;
        // array3[0]= new StringBuilder("ok");
        array2[0]= new StringBuilder("ok");

    }
    
}