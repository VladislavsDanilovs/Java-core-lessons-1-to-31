package Lesson22;

public class Chelovek {

   final String pol;
   public Chelovek(String pol){
       this.pol = pol;
   }

   private String name;
   public String getName(){
       return name;
   }

   public void setName(String s){
    name = s;
   }

   private int age;
   public int getAge(){
       return age;
   }

   public void setAge(int i){
    if(i>0){
        age= i;
    }
   }


   private int ves;
   public int getVes(){
       return ves;
   }
   public void setVes(int i){
    if(i>0){
        ves = i;
    }
   }
    
}

class Test{
    public static void main(String[] args) {
        Chelovek c = new Chelovek("Male");
         c.setName("Maxim");
         c.setVes(115);
         c.setAge(15);
         System.out.println(c.getName());
         System.out.println(c.getAge());
         System.out.println(c.getVes());


    }
}
