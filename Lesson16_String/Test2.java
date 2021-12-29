package Lesson16;

public class Test2 {
    

    public static void main(String[] args) {
        String s1 = new String("hello");

        // String s10 = s1.substring(3);
        // System.out.println(s10);

        // String s11 = s1.substring(3,7);
        // System.out.println(s11);

        // String s12 = s1.trim();
        // System.out.println(s12);

        
        // // String s13 = s1.trim();
        // System.out.println(s13);

        String s14 = s1.replace('r','b');
        System.out.println(s14);


        String s15 = s1.replace("hello", "bye");
        System.out.println(s15);

        String s2 = "bye";
        String s3 = s2.replace('k','k');

        String s4 = "hello, ";
        String s5 = "good";
        System.out.println(s4.concat(s5));

    }
}
