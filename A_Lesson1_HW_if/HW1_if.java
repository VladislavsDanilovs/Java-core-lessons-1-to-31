package A_Lesson1_HW_if;

import java.util.Scanner;

public class HW1_if {

}

class TryScan {

    // public void compare1(int a) {
    //     if (a > 5) {
    //         System.out.println(a + " is bigger then 5");
    //     } else if (a < 5) {
    //         System.out.println(a + " is smaller then 5");
    //     } else if (a == 5) {
    //         System.out.println(a + " equals 5");
    //     }

    // }

    // public void checkInterval(int a){
    //     if (a >= 20 && a <= 50){
    //         System.out.println(a +" is in the intevral between 20 and 50");
    //     } else{
    //         System.out.println(a + " Not at the interval between 20 and 50");
    //     }
    // }

        public void closeToFive(int a, int b){
            
            if (a > 5 && a < b){
                System.out.println("Nearest number is: "+a);
            } else if(a < 5 && a > b){
                System.out.println("Nearest number is: "+a);
            } else{
                System.out.println("Nearest number is: "+b);
            }
            
        
        }

    public static void main(String[] args) {
        TryScan t1 = new TryScan();
        t1.closeToFive(4, 6);

        // Scanner value1 = new Scanner(System.in);

        //         System.out.println("Enter your number");
        //         int s1 = value1.nextInt();
        //         if (s1 >= 0){
        //            System.out.println(s1 * 2);
        //         } else if( s1 < 0 ){
        //             System.out.println(s1 * 10);
        //         }

        // System.out.println("Enter three numbers one by one at one row, seperating
        // them by pressing spacebar");

        // int k1 = value1.nextInt();
        // int k2 = value1.nextInt();
        // int k3 = value1.nextInt();

        // if(k1 < k2 && k1 > k3 ){
        // System.out.println("Your number is: "+k1);
        // } else if(k1 > k2 && k1 < k3 ){
        // System.out.println("Your number is: "+k1);
        // } else if(k2 < k1 && k2 > k3 ){
        // System.out.println("Your number is: "+k2);
        // } else if(k2 > k1 && k2 < k3 ){
        // System.out.println("Your number is: "+k2);
        // } else if(k3 < k1 && k3 > k2 ){
        // System.out.println("Your number is: "+k3);
        // } else if(k3 > k1 && k3 < k2 ){
        // System.out.println("Your number is: "+k3);
        // }

    }

}
