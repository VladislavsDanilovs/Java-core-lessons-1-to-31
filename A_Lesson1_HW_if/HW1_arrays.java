package A_Lesson1_HW_if;

import java.util.Scanner;

public class HW1_arrays {

    public static void main(String[] args) {

        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // int column1 = 2;
        // int row1 = 4;
        // for(int i=0; i<row1; i++){

        // for(int j =0; j<=i; j++){
        // System.out.print("8");
        // }
        // System.out.println();
        // }

        // Scanner scan1 = new Scanner(System.in);
        // System.out.println("Enter 2 numbers");
        // int row1 = scan1.nextInt();
        // int column1 = scan1.nextInt();

        // for(int i=0; i<row1; i++){

        // System.out.println();

        // for(int j=0; j<column1; j++){
        // System.out.print(5);
        // }
        // }
    }

}

// Scanner sc1 = new Scanner(System.in);
// System.out.println("Enter 5 strings");
// int s1 = sc1.nextInt();
// int s2 = sc1.nextInt();
// int s3 = sc1.nextInt();
// int s4 = sc1.nextInt();
// int s5 = sc1.nextInt();

// int t1 = 0;

// int[] arr1 = {s1, s2, s3, s4, s5};

// for(int i = 0; i<arr1.length; i++){
// System.out.println("________");
// System.out.println(arr1[i]);
// }

// for(int i = 0; i<arr1.length; i++){

// }

// System.out.println(t1);
// sc1.close();

// int[] array1= new int[10];
// for(int i=0; i< array1.length; i++){
// array1[i] = 20 + i;
// System.out.println(array1[i]);
// }

// int a = 0;
// int min = 0;

// int[] array1 = {0, 5, -3, 2};

// for (int i = 0; i < array1.length; i++) {

// min = array1[i];
// int index = i;
// for (int j =i+1; j < array1.length; j++) {
// if (array1[j] > min) {
// min = array1[j];
// index = j;
// }
// }
// if (i != index) {
// a = array1[i];
// array1[i] = min;
// array1[index] = a;
// }

// }

// for (int i = 0; i < array1.length; i++) {
// System.out.println(array1[i]);
// }

// public static int[] initializeArray(){

// int[] array1 = new int[10];
// Scanner sc1 = new Scanner(System.in);
// int s1 = sc1.nextInt();

// for(int i=0; i<array1.length; i++){
// array1[i] = s1;
// }
// for(int i=0; i<array1.length; i++){
// System.out.println(array1[i]);
// }

// return array1;
// }