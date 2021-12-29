package Lesson20;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char operator;
        double num1, num2;

        Scanner kk = new Scanner(System.in);

        System.out.println("Enter the operator(+, -, *, /)");

        operator = kk.next().charAt(0);

        System.out.println("Enter two number one by one");
        num1 = kk.nextDouble();
        num2 = kk.nextDouble();

        switch (operator) {
            case '+':

                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;

            case '-':

                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;

            case '/':
                if(num2 != 0){
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Diveded by zero!");
                }
                break;

            default:
                System.out.printf("%c is an invalid number", operator);
                break;
        }
    }

}
