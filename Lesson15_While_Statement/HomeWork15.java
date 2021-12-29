package Lesson15;

public class HomeWork15 {

    // outer and inner while
    // middle do while

    public static void time() {
        int h = 0;

        OUTER: while (h <= 5) {
           int m = -1;

            MIDDLE: do {
                m++;
                int s = 0;
                if (h > 1 && m % 10 == 0) {
                    break OUTER;
                }
                INNER: while (s <= 58) {
                    if (s * h > m) {
                        continue MIDDLE;
                    }
                    System.out.println(h + "h:" + m + "m:" + s + "s");
                    s++;
                }
                System.out.println(h + "h:" + m + "m:" + s + "s");
                
          

            } while (m < 59);
            h++;
        }

    }
}

class HomeWork15Test {
    public static void main(String[] args) {
        HomeWork15.time();
    }
}