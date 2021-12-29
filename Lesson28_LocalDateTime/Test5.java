package Lesson28;
import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        // Period p = Period.ofMonths(10).ofDays(10);
        // Period p = Period.ofMonths(3);
        // p=Period.ofDays(10);
        Duration d = Duration.ofDays(2);
        System.out.println(nachalo.plus(d));
    }
}
