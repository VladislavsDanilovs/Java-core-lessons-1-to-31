package Lesson15;

public class Test7 {

    public static void main(String[] args) {
        

        int money = 0;

        do{

            System.out.println("Make your bet");
            System.out.println("You lost");
            money-=10;
        }
        while(money>50);

    }
    
}
