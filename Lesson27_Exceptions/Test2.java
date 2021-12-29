package Lesson27;

public class Test2 {
    public static void main(String[] args) throws NullPointerException  {
        int array [] = {1, 2 ,4};

        try{
            System.out.println(array[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught:" +e);
        }
        
        System.out.println("Hello");
    }
    
}
