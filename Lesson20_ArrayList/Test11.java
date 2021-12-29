package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Lucian Maximov");
        map.put(778, "Nikolaich Maximov");
        map.put(779, "Zaur Maximov");
        map.put(780, "Eduard Maximov");
        map.put(777, "Eduard Maximov");

        map.remove(778);

        System.out.println("map = " +map);
    }
    
}
