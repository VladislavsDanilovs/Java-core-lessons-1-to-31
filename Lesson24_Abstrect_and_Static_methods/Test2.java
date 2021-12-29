package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);

        f1.ploshadj();
    }


}

abstract class Figura {

    int kolichestvoStoron = 7;

    abstract void perimetr();

    abstract void ploshadj();

    void showinfo() {
        System.out.println("some good info");
    }

}

class Kvadrat extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata =" + 4 * storona1);
    }

    public void ploshadj() {
        System.out.println("Ploshadj kvadrata =" + storona1 * storona1);
    }

}

class XXX extends Kvadrat{
}

class Prjamougoljnik extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr prjamougoljnika =" + 2 * (storona1+storona2));
    }

    public void ploshadj() {
        System.out.println("Ploshadj prjamougoljnika =" + storona1 * storona2);
    }
}

class Okruzhnostj extends Figura {
    int radius = 3;
    public void perimetr() {
        System.out.println("Perimetr okruzhnosti =" + 2 * 3.14 * radius);
    }

    public void ploshadj() {
        System.out.println("Ploshadj okruzhnosti =" + 2 * 3.14 * radius* radius);
    }
}

abstract class Chetirexugolnik extends Figura{
    void def() {System.out.println("chetirexugolnik");}
}