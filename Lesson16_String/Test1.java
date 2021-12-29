package Lesson16;

public class Test1 {
    

    public static void main(String[] args) {
        String s1 = new String("ab@cdefgabcd");
        String s2 = new String("hello");


        int kk = s2.length();
        System.out.println(kk);
        System.out.println(s2.indexOf('p'));

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('d');
        System.out.println(i1);

        int i2 = s1.indexOf("@");
        System.out.println(i2);

        int i3 = s1.indexOf("Z");
        System.out.println(i3);

        int i4 = s1.indexOf('a',5);
        System.out.println(i4);

        boolean i5 = s1.startsWith("abc",7 );
        System.out.println(i5);

        boolean i6 = s1.endsWith("cd");
        System.out.println(i6);

    }
}
