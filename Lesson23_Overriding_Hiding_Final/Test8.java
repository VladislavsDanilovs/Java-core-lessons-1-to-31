package Lesson23;

public class Test8 {
    
String s1 = "hello";


static double d1= 3.14;
int summa(int ... i) {
    int result = 0;
    for(int a : i) {
        result += a;
    }
    return result;
 }

 static void abc() {
     System.out.println("static method");
    }
}

class B10 extends Test8 {
    // String s1 = super.s1 + ", drug:";
    double d1 = super.d1; //k staticheskim peremenim mozhno obrashatsja s pomoshju super


    boolean s1 = true;
    int summa (int ... i) {
        int result = super.summa(i);
       
        System.out.println("Summa: "+result);
        super.abc();//tak kak metod abc stat metod super klassa to k nemu mozhno tak obratittsja
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}
