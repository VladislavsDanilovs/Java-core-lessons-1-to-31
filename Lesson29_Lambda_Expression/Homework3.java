package Lesson29;

public class Homework3 {
    static void def(Test69 t) {
        System.out.println(t.abc("hello"));
    }
    public static void main(String[] args) {
        def(x -> {return x.length();});
    }
}

interface Test69 {
    int abc(String s);
}
