package Lesson19;

public class HomeWork {

    public static String[] abc(String [] ... a){
       
        int length = 0;


        for(String [] b : a) {
            length=length + b.length;
            // for(String c : b){
            //     System.out.print(c + " ");
            // }
      
        }
        String[] target = new String[length];
        int count = 0;
            for(String [] c : a){
                for(String d : c){
                    target[count] = d;
                    count++;
                }
            }

        return target;
 
        }

    public static void main(String[] args) {


        String[] target = abc(new String[] {"Ok","kk","gg"}, new String[] {"ok", "hello","goodbye"}
        );


 for(int i=0; i<target.length; i++){
     System.out.println(target[i]);
 }
        // String[] a1 = {"Hello","Patrik","Star"};
        // String[] a2 = {"Hello","SpongeBob","Square Pants"};
        // String[] a3 = {"Hello","Mr","Crabs"};

      
        
    
        //     abc(a1, a2, a3);
   
    }
    
}
