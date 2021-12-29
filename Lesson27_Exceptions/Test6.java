package Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {

        try{
            File f = new File("test8.java");
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e){
            System.out.println("caught exception 1");
        }
        catch(NullPointerException e){
            System.out.println("caught exception 2");
        }
        catch(IOException e){
            System.out.println("caught exception 3");
        }
// Sperva dolzhni idti child classi , potom uzhe parent klassi, t.e. sperva FileNotfound exception potom IOException, inache budet unreacheble code

    }
    
}
