package Lesson14;

public class HomeWork14 {

    public static void time() {
        HOURS: for (int hours = 0; hours <= 5; hours++) {

            MINUTES:

            for (int minutes = 1; minutes <= 59; minutes++) {

                if (hours > 1 && minutes % 10 == 0) {
                    break HOURS;
                }
                SECONDS:

                for (int seconds = 1; seconds <= 59; seconds++) {

                    if (seconds * hours > minutes) {
                        continue MINUTES;
                    }

                    System.out.println(hours + "h:" + minutes + "m:" + seconds + "s");
                }
            }

        }

    }
}

class HomeWork14Test {
    public static void main(String[] args) {
        HomeWork14.time();
    }
}
