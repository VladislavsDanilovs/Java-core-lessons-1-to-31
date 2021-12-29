package Lesson13;

public class HomeWork13 {

}

class Month {

    public static void monthNumber(int m) {
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("In this month we have 30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("In this month we have 31 days");
                break;
            case 2:
                System.out.println("Fuckin leap day month, 28 days this year");
                break;
            default:
                System.out.println("This month number does not exist");
        }
    }
}

class MonthTest {

    public static void main(String[] args) {
        Month.monthNumber(7);
    }

}