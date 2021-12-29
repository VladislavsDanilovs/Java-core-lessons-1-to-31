package Lesson1;

public class homeWork6 {
    
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;

    int OL() {
        return 0;
    }
 
    int OL(int i1) {
        return i1;
    }
    int OL(int i1, int i2) {
    return i1 + i2;
    }
    int OL(int i1, int i2, int i3) {
    return i1 + i2 + i3;
    }
    int OL(int i1, int i2, int i3, int i4) {
    return i1 + i2 + i3 + i4;
    }
    int OL(int i1, int i2, int i3, int i4, int i5) {
    return i1 + i2 + i3 + i4 + i5;
        }

class overloadTest{

    public static void main(String[] args) {
      homeWork6 h = new homeWork6();
      System.out.println(h.OL());
    }
   
    }
}