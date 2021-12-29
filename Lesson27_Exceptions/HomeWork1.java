package Lesson27;

public class HomeWork1 {
    public static void main(String[] args) {
        Tiger7 t1 = new Tiger7();
        t1.eat("meat");
        try{
            t1.drink("water");
            try{
                t1.drink("beer");
            } catch(NeVodaException e) {
                System.out.println(e.getMessage());
            } finally{
                System.out.println("this is inner finnaly block");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
    
}

class NeMjasoException extends RuntimeException {
    NeMjasoException(String name){
        super(name);
    }
    NeMjasoException(){}
}

class NeVodaException extends Exception {
    NeVodaException(String name){
        super(name);
    }
    NeVodaException(){}
}

class Tiger7 {
    public void eat(String a){
        String b = "meat";
        if(a.equals(b)){
            System.out.println("Tiger eats meat");
        } else {
            throw new NeMjasoException("Tiger does not eat "+a);
        }
    }

    public void drink(String a) throws NeVodaException{
        String b = "water";
        if(a.equals(b)){
            System.out.println("Tiger drinks water");
        } else {
            throw new NeVodaException("Tiger does not drink "+a);
        }
    }
}
