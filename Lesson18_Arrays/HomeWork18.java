package Lesson18;


import java.util.Arrays;
public class HomeWork18 {
//SORTING arrays
    public void sortirovka(double array1[]){

       
        // Arrays.sort(array1);
        // for(int i=0; i<array1.length; i++){
        //     System.out.println(array1[i]);
        // }
      
          
          
        

            double min;
            int index;
            double a;

                for(int j=0; j<array1.length; j++){
                        min = array1[j];
                        index = j;

                        for(int i =j+1; i<array1.length;i++){
                            if(array1[i]<min){
                                min = array1[i];
                                index = i;
                            }
                         
                        }

                        if(j != index) {
                            a = array1[j];
                            array1[index] = a;
                            array1[j] = min;
                        }


                        System.out.println(array1[j]);
              
                }
    }
}

class Homework18test{
    public static void main(String[] args) {
        HomeWork18 h1 = new HomeWork18();
        double [] array = {2, -1, -3, 5, 4, 7};
        h1.sortirovka(array);
    }
 
    
}