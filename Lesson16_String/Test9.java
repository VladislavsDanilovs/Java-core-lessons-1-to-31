package Lesson16;

public class Test9 {

    public static void main(String[] args) {
        
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);

        String s10 = "hi";
        String s11 =  "Hi";

        System.out.println(s10.equalsIgnoreCase(s11));
    
    }
}
