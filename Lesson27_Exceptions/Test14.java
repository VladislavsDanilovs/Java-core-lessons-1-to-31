package Lesson27;
import java.io.*;

public class Test14 {
    static FileInputStream fis1, fis2;
    public static void main(String[] args) {
        try{
            fis1 = new FileInputStream("test9.text");
            System.out.println("File test9 exist");
            try{
                fis2.close();
            } catch(IOException e){
                System.out.println("IOException error fis2 close");
            }
        } catch(FileNotFoundException e) {
            System.out.println("file test9 not found");
        }
        catch(NullPointerException e) {
            System.out.println("Nullponterexception worked");
        }
    }
     
    
}
