package Lesson24;

public class HomeWork1 {
    public static void main(String[] args) {
        // Mechenosec m1 = new Mechenosec("Pavlik");
        // System.out.println(m1.name);
        // m1.swim();
        // m1.eat(); 
        // m1.sleep();

        // Speakable p1 = new Pingvin("KinderPingui");
        // p1.speak();
    
        // Animal777 l1 = new Lev("Leo");
        // System.out.println(l1.animalName);
        // l1.sleep();
        // l1.eat();


        // Mammal l2 = new Lev("Lef");
        // System.out.println(l2.mammalName);

        // l2.run();
        // l2.sleep();
        // l2.eat();
        // l2.play();

        // ispolzuja if i instanceof proverjaete na kakoj objekt ssilaetsja peremennaja i vivodite na ekran
        // sootvetstujushie peremennie dannogo objekta i vizivajte ego metodi

        Speakable p1 = new Pingvin("Pavlik");
        Speakable l1 = new Lev("Leo");

        Animal777 m1 = new Mechenosec("Fish");
        Animal777 p2 = new Pingvin("Pinguin");
        Animal777 l2 = new Lev("Cat");

        Lev l3 =  new Lev("Lion");
        Animal777 l4 =  new Lev("Lion");
        Mammal l5 =  new Lev("Lion");

        Bird p3 = new Pingvin("Pavel");
        Pingvin p4 = new Pingvin("Pavlik");

        Fish mech1 = new Mechenosec("Fish1");
        Mechenosec mech2 = new Mechenosec("Fish2");





        Speakable [] array1 = {p1, l1, l5, p3, p4, l3}; //soderzhat v sebe vse vozmozhnie ssilochnie peremenie, ssilajushiesja na vse vozmozhnie objekti
        Animal777 [] array2 = {m1, p2, l2, l3, l4, l5, p3, p4, mech1, mech2};
        
        for(Speakable a1 : array1){
            if(a1 instanceof Lev){
              Lev m = (Lev)a1;
            System.out.println(m.levName);
            m.run();
            m.sleep();
            m.eat();
            m.play();
            }
            if(a1 instanceof Pingvin){
                Pingvin p = (Pingvin)a1;
            System.out.println(p.pingvinName);
            p.speak();
            p.sleep();
            p.eat();
            p.fly();
            }

       
            
        }

        for(Animal777 a2 : array2){
            if(a2 instanceof Lev){
            System.out.println(((Lev)a2).levName);
            ((Lev)a2).run();
            ((Lev)a2).sleep();
            ((Lev)a2).eat();
            ((Lev)a2).play();
            }
            if(a2 instanceof Pingvin){
            System.out.println(((Pingvin)a2).pingvinName);
            ((Pingvin)a2).speak();
            ((Pingvin)a2).sleep();
            ((Pingvin)a2).eat();
            ((Pingvin)a2).fly();
            }
            if(a2 instanceof Mechenosec){
                Mechenosec m = (Mechenosec)a2;
                System.out.println(m.mechenosecName);
                m.swim();
                m.eat();
                m.sleep();
            }
       
            
        }



    }
}

abstract class Animal777{
    Animal777(){}
    String animalName;
    Animal777(String name){
       this.animalName = name;

    }
   

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal777{
    Fish(String name1) {
        super(name1);
        String fishName = name1;
    }

    public void sleep(){
        System.out.println("Vsegda interesno nabludat, kak spjat ribi");
    }

    abstract void swim();

}

abstract class Bird extends Animal777 implements Speakable{
    Bird(String name){
        super(name);
        String birdName = name; 

    }
    
    public void speak(String birdName){

        System.out.println(birdName+"sings");
    }


    abstract void fly();
}

abstract class Mammal extends Animal777 implements Speakable{
    String mammalName;
    Mammal(String name){
        super(name);
        this.mammalName = name;
    }

    abstract void run();
    abstract void play();
  
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    String mechenosecName;
    Mechenosec(String name) {
        super(name);
        this.mechenosecName = name;
    }
    
    public void swim(){
        System.out.println("Mechenosec krasivaja riba, kotoraja bistro plavaet");
    }
    public void eat(){
        System.out.println("Mechenosec nehishnaja riba, i ona est obichnij korm");
    }


}

class Pingvin extends Bird{
    String pingvinName;

    Pingvin(String name){
        super(name);
       this.pingvinName = name;
    }

    public void fly(){
        System.out.println("Pingvini ne umejut letatj!");
    }

    public void eat(){
        System.out.println("Pingvin ljubit estj ribu");
    }

    public void sleep(){
        System.out.println("Pingvini spjat prislanivshisj drug k drugu");
    }

    public void speak(){
        System.out.println("Pingvini ne umejut petj kak solovji");
    }
}

class Lev extends Mammal{
    String levName;
    Lev(String name){
        super(name);
         this.levName = name;
    }

    public void run(){
        System.out.println("Lev eto ne samaja bistraja koshka");
    }
    public void eat(){
        System.out.println("Lev, kak ljuboj hishnik ljubit mjaso");
    }

    public void sleep(){
        System.out.println("Bolshuju chastj dnja lev spit");
    }

    public void play(){
        System.out.println("Lion is playing");
    }

}