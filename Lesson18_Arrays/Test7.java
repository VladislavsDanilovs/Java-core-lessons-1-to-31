package Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char [] array = {'H','e','l','l','o'};
        // String s = new String(array);
        // System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
        // sb.append(array, 2, 3);
        sb.insert(2,array,1,3);
        System.out.println(sb);
    }
}
