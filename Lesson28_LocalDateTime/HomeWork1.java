package Lesson28;

import java.time.*;
import java.time.format.*;


public class HomeWork1 {


    public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Duration d1, Period p1){
        while (ldt1.isBefore(ldt2)) {
            DateTimeFormatter template1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
            DateTimeFormatter template2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

            /* 1*/ System.out.print("| Working from: " + ldt1.format(template1));
        
            /* 2*/  ldt1 = ldt1.plus(p1);
                    ldt1 = ldt1.plus(d1);
                   
            System.out.print(" Till: "+ ldt1.format(template1));
            
            /* 3*/ System.out.println("||| Weekend from: " + ldt1.format(template2));
                    
            /* 4*/ ldt1 = ldt1.plusDays(2);
            System.out.print(" Till:" + ldt1.format(template2));
        
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2021, Month.OCTOBER, 18, 8, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2021, Month.NOVEMBER, 29, 17, 0);
        Period p1 = Period.ofDays(5);
        Duration d1 = Duration.ofHours(9);
        HomeWork1 h1 = new HomeWork1();

        h1.smena(ldt1, ldt2, d1, p1);
      



        // System.out.println(ldt1.format(template2));
    }
   
    

}


