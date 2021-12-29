package Lesson28;
import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ldt1 = LocalDate.of(2015, 9, 9);
        LocalDateTime ldt2 = LocalDateTime.of(2015, 9, 9,23, 23);
        LocalTime lt = LocalTime.of(16, 40);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(ldt2.format(f));



        // DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        // System.out.println(ldt1);
        // System.out.println(ldt1.format(d1));


        // DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        // DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        // System.out.println(ldt1.format(shortFormat));

    }

    
}
