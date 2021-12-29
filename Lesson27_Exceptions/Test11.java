package Lesson27;

import java.io.*;

public class Test11 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test10 not found ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file test9 not found ");

        } finally {
            System.out.println("Eto vnewiy finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("IO exception in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t1 = new Test11();
        t1.abc();
    }

}
