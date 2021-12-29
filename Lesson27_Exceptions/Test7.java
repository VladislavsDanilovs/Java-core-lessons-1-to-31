package Lesson27;
import java.io.*;


public class Test7{
 public static void main(String[] args){
     StringBuilder result = new StringBuilder("");

     try{
         File f = new File("text9.txt");
         System.out.println("Object File is created");
         FileInputStream fis = new FileInputStream(f);
         System.out.println("Stream is Created");

         int counter = 0;
         while(true){
             counter++;
             result.append(fis.read());
                System.out.println("Reading the information");
                if (counter == 3) {fis.close();}
         }
     }
     catch(FileNotFoundException e){
         System.out.println("Exception 1");
     }
     catch(IOException e){
        System.out.println("Exception 2");
    }
    finally{System.out.println("This is finaly");}
 }

}