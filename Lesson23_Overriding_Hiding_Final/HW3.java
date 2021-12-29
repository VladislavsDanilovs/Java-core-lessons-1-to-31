package Lesson23;

public class HW3 {

        
}

class X{
    public X() { System.out.println("X");  }
    public X(int i) { System.out.println("X" + i);  }
    
    private boolean abc()  {  return  false; }
    public static void main(String[] args) {
     X x = new Y(18);
    System.out.println ( x.abc()  );
       }
    }
    
    class Y extends X {
        public Y() {  System.out.println("Yyaaa");   }
    public Y(int i) {  System.out.println("Y");   }
    public Boolean abc ()  {   return true;  }
    }