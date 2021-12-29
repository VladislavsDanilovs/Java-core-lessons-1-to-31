package Lesson15;

public class Test2 {
    public static void main(String[] args) {
        
        int money = 100;

        while (money > 0) {
            System.out.println("Make a bet");
            System.out.println("You lost");
            money-=10;
        }
    }
    
}
