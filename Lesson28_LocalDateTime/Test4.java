package Lesson28;
import java.time.*;


public class Test4 {
    static void smenaDezhurnogo(LocalDate nachalo, LocalDate konec, Period p ){
        LocalDate data = nachalo;
        while(data.isBefore(konec)){
            System.out.println("Nastupila data " +data+". Pora menajtj dezhurnogo");
            data = data.plus(p);

        }
    }
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.ofDays(1);
        smenaDezhurnogo(nachalo, konec, p);
    }    
}
