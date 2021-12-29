package Lesson13;

public class Employee {
    public static void main(String[] args) {
        int dayOfTheWeek = 3;


        switch (dayOfTheWeek * 3) {
            case 1:
            
            case 2:
                
            case 3:
             
            case 4:
              
            case 5:
                System.out.println("Work till 18:00");
                break;
            case 6:
                System.out.println("Work till 12:00");
                break;
            case 7:
                System.out.println("day off");
                break;

            default:
                System.out.println("That day do not exist");;
        }
    }
}
