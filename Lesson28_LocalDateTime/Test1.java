package Lesson28;
import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        // System.out.println(LocalDate.now());
        // System.out.println(LocalTime.now());
        // System.out.println(LocalDateTime.now());

    //     LocalDate ld1 = LocalDate.of(2014,5,15);   
    //     // System.out.println(ld1);
    //     // LocalDate ld2 = LocalDate.of(2021,Month.FEBRUARY,29);   
    //     // System.out.println(ld2); 
    //    ld1 = ld1.plusDays(5);
    //     System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);

        lt1 = lt1.plusHours(1).minusHours(10).plusSeconds(152);
        lt1 =  lt1.minusMinutes(10);
        lt1 =   lt1.plusSeconds(25);
        lt1 =  lt1.minusNanos(95234);

        System.out.println(lt1);


        LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 9,23, 23);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(10).minusMonths(25).plusDays(5).minusMinutes(25);
        System.out.println(ldt1);
       
    }   

    
}