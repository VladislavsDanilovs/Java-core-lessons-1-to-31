package Lesson16;

public class HomeWork16a {

    public void email(String a) {

    int s = 0;
    int b = 0;
    int c = 0;
    while (c < a.length()-1) {

        s = a.indexOf('@', c);
        b = a.indexOf('.', c);
        c = a.indexOf(';', c+1);
        System.out.println(a.substring(s +1, b));

        System.out.println(s);
        }
    }
}

class HomeWork1aTest {
    public static void main(String[] args) {

        HomeWork16a c1 = new HomeWork16a();
        c1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
