package Lesson16;

public class HomeWork16 {

    /*
    Task description:
    output should look without @, . , and etc. without text after @.
    */

    public void email(String a) {

        char c1;

        for (int i = 0; i < a.length(); i++) {
            c1 = a.charAt(i);

            if (c1 == '@') {
                String s1 = a.substring(i);
                String s2 = s1.replace("@", "");
                String s3 = s2.substring(0, s2.indexOf('.'));
                System.out.println(s3);
            }

        }

    }
}

class HomeWork16Test {
    public static void main(String[] args) {

        HomeWork16 c1 = new HomeWork16();
        c1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}
