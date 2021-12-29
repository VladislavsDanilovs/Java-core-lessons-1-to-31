package Lesson27;

import java.io.*;

public class Test9 {
    
    void abc() throws FileNotFoundException {

        try{
            File f = new File("text10.txt");
            FileInputStream fis = new FileInputStream(f);
           
        }
            catch(FileNotFoundException e) {
                System.out.println("Exception poyman i nemnogo obrabotan");
                throw e;
            
            }
            finally{
              
                System.out.println("Variable a in finally block");
            }     
    }

    // void method() {
    //     try {
    //         abc();
    //     } catch (FileNotFoundException e) {
    //         System.out.println("Exception poyman i obrabotan");
    //     }
    // }
    // void def(){

    //     try{
    //        int [] array1 = {1, 2 ,4, 7};
    //        System.out.println(array1[5]);
    //     }
    //         catch(ArrayIndexOutOfBoundsException e) {
    //             System.out.println("Exception poyman i nemnogo obrabotan");
    //             throw e;
    //         }
    //         finally{
    //             System.out.println("Variable a in finally block");
    //         }     
    // }

}
