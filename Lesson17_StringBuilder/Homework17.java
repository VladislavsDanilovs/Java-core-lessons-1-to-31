package Lesson17;

public class Homework17 {

    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean a = true;
        char c1;
        char c2;

        for (int i = 0; i < sb1.length(); i++) {
            c1 = sb1.charAt(i);
            c2 = sb2.charAt(i);
            if (sb1.length() == sb2.length() && c1 == c2) {
                a = true;
                continue;

            } else {
                a = false;
                break;

            }
        }
        System.out.println(a);
        return a;
    }
}

class HomeWork17Test {
    public static void main(String[] args) {
        Homework17 h1 = new Homework17();
        StringBuilder sb1 = new StringBuilder("gg");
        StringBuilder sb2 = new StringBuilder("gg");
      
        // h1.ravenstvo(sb1, sb2);

        h1.ravenstvo(new StringBuilder(), new StringBuilder());

    }
}
