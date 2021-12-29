package Lesson28;
import java.time.*;

public class Test3 {

        public static void main(String[] args) {
            LocalDate ld1 = LocalDate.of(2014, 5, 31);
            LocalDate ld2 = LocalDate.of(2012, Month.JUNE, 18);
    
            System.out.println(ld1.isBefore(ld2));
    
            LocalTime lt1 = LocalTime.of(15, 30);
            LocalTime lt2 = LocalTime.of(03, 5, 18, 55345);
            System.out.println(lt1.isBefore(lt2));

            LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 9,23, 23);
            LocalDateTime ldt2 = LocalDateTime.of(2015, 9, 9,23, 23, 9);
        }

 
}
