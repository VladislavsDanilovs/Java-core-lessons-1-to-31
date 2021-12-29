package Lesson27;

public class Test12 {
    void abc() {
        int [] array1 = {1, 2, 3};
        try{
            System.out.println(array1[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e){
            System.out.println("Caught NullPointerException");

        }
    }
    public static void main(String[] args) {
        Test12 t2 = new Test12();
        t2.abc();
    }
}
