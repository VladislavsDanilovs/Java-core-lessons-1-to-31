package p4;

import p1.A;
import static p1.p2.B.bratishka;
import p1.p2.p3.C;
import p4.p5.E;

public class D {

    //kod kotorij zadejstvuet elementi klassov A, C , E.
    // a tak zhe static elementi klassa B
    //Ispolzovatj virazhenija import i import static
    // dlja togo chtobi ne pisatj polnoe imja klassa.

    public static void main(String[] args) {

        A a777 = new A();
        String infoA = a777.a2;

        String bratishka1 = bratishka;

        C c777 = new C();
        String infoC = c777.caplja;

        E e777 = new E();
        String infoE = e777.epifanov;

        System.out.println(infoA);
        System.out.println(bratishka1);
        System.out.println(infoC);
        System.out.println(infoE);

    }
    
}
