package Lesson27;
import java.io.*;
public class Test8 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");

        try{
            File f = new File("text10.txt");
            FileInputStream fis = new FileInputStream(f);
           
        }
            catch(FileNotFoundException e) {
                System.out.println("Exception poyman");
                System.out.println("Variable a in catch block =" +a);
                return a;
            }
            finally{
                a.append("!!!!");
                System.out.println("Variable a in finally block =" +a);
                System.out.println("Eto block finally");
            }

            return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());
 
    }
    
}
