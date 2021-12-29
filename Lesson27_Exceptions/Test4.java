package Lesson27;

import java.io.*;

public class Test4 {

        void abc() throws FileNotFoundException {
            File f = new File("text9.txt");

            // try {
    
                FileInputStream fis = new FileInputStream(f);
    
                System.out.println("have a good day, sir!");
            // }
    
            // catch (FileNotFoundException e) {
            //     System.out.println("Bil pojman exception" + e);
    
            // }
        }
        
        void def() throws FileNotFoundException{
            System.out.println("Hi");
            abc();
        }
        
        
        public static void main(String[] args) throws FileNotFoundException{

            Test4 t1 = new Test4();
            try{
                t1.def();

            } catch (FileNotFoundException e) {
                System.out.println("Exception pojman");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
          
    }

}
