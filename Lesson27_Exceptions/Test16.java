package Lesson27;
import java.util.*;

public class Test16 {

    static Doctor [] array1;

    static ArrayList <String> list1;

    public static void main(String[] args) {
        // list1.add("1");
        // list1.add("2");
        // System.out.println(list1.get(3));
        // System.out.println(5 /0);
        
    // Doctor d = new Doctor();
    // Teacher t = new Teacher();
    // Teacher t3 = new Teacher();
    // Teacher [] array2 = {t, t3};
    // Employee [] array1 = {d, t};
    // Teacher t2 = (Teacher)array1[0]; //class cast exception
    // Doctor d2 = (Doctor)array2[0];

        // list1.add("Khau");

        Integer.parseInt("44ab", 16);
    createPwd("arakaraba12121212ra");
    }
    public static void createPwd(String pwd) {
        if(pwd.length()<6){
            throw new IllegalArgumentException("Dlina parolja malenkaja");
            
        }
        if(pwd.length()>12){
            throw new IllegalArgumentException("Dlina parolja bolwaja");

        }
        System.out.println("password is ok");
    }
    
}

class Employee{}

class Doctor extends Employee{}
class Teacher extends Employee{}



// class Airplane{
    
//     String status = "Is waiting"; //Waiting, in air, flight delayed
//     public void fly(){
//         status = "In air";
//         System.out.println("Plane is moving to destination throw the sky");
//     }
//     public void waiting(){
//         if(status.equals("In air")){
//             throw new IllegalStateException("Plane is in air");
//         }
//         status = "Is waiting";
//         System.out.println("plane is waiting his flight");
//     }
//     public void flightDelayed(){
//         if(status.equals("In air")){
//             throw new IllegalStateException("Plane is already in air");
//         }
//         status = "Flight delayed";
//         System.out.println("Planes flight is delayed ");
//     }
//     public static void main(String[] args) {
//         Airplane p1 = new Airplane();
//         p1.fly();
//         p1.waiting();
        
       
//     }
// }