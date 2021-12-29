package A_Lesson1_HW_if;

import java.util.Scanner;

public class HW1_for {
    
    public static void main(String[] args) {

        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
  
        int b =0;

        for(int i=0; i<=4; i++){
            i = scan1.nextInt();

            b+=i;
         
        }
        System.out.print(b);


    }

}


        // int i = 0;
        // int j = 0;
        // while (i<10) {
        //     System.out.println();
        //     i++;
        //     j = 0;
        //     while (j<10) {
        //         System.out.print("P");
        //         j++;
        //     }
        // }

    // Scanner scan1 = new Scanner(System.in);
    //     System.out.println("Enter 2 numbers");
    //     int row1 = scan1.nextInt();
    //     int column1 = scan1.nextInt();
        
    //     for(int i=0; i<row1; i++){
        
    //         System.out.println();

    //         for(int j=0; j<column1; j++){
    //             System.out.print(5);
    //         }
    //     }



    // Scanner scan1 = new Scanner(System.in);
        // System.out.println("Enter string and number one after other using enter");
        // String s1 = scan1.nextLine();
        // int i1 = scan1.nextInt();
        // System.out.println("Your string is: "+s1);
        // System.out.println("Your number is: "+i1);
        // int i = 0;
        // while (i < i1) {
        //     System.out.println(s1);
        //     i++;
        // }


        // for(int i =1; i<=100; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
          
        // }
        // int i = 10;
        // while (i>=1) {
        //     System.out.println(i);
        //     i--;
        // }