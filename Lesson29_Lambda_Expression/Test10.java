// package Lesson29;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.function.Predicate;

// public class Test10 {
//     public static void main(String[] args) {
//         List<String> list1 = List.of("privet", "poka", "kak dela?", "vse normalno");
//         String str = "kdakwdakd";

//         for (String s : list1) {

//             Predicate<String> p = z -> {
//                 System.out.println(str.length());
//                 return z.length() > 4;
//             };
//         }
  

//         // for(String s : list1){
//         // System.out.println(s);

//         // }

//         // list1.forEach(s -> System.out.println(s));

//         // ArrayList <Integer> al = new ArrayList<>();
//         // al.add(1);
//         // al.add(6);
//         // al.add(2);
//         // al.add(3);
//         // al.add(4);
//         // al.add(5);
//         // al.add(7);
//         // // al.removeIf(elem -> elem % 3 == 0);
//         // // Predicate<Integer> p = elem -> elem % 3 == 0;
//         // // al.removeIf(p);
//         // System.out.println(al);

//         // al.sort((x, y)-> x.compareTo(y));
//         // System.out.println(al);

//     }
// }
