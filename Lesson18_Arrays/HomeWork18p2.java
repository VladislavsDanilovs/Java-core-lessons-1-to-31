package Lesson18;



public class HomeWork18p2 {

    public void showArray(String[][] array1){

     System.out.print("{");
      
        for (int i=0; i<array1.length; i++) {
            System.out.print("{");
                for(int j=0; j<array1[i].length; j++){
                    if(j != array1[i].length-1){
                        System.out.print(array1[i][j]+",");
                    } else{
                        System.out.print(array1[i][j]+"}");
                    }

                }
                if(i != array1.length-1) {
                    System.out.print(",");
                    
                } else {
                    System.out.print("}");
                }
        }
    
        // System.out.print("{"+"{"+array1[0][0]+""+array1[0][1]+"}"+","+"{"+array1[1][0]+"}"+","+"{"+array1[1][0]+","+array1[1][1]+"}"+"}");
    }
    
}

class HomeWork18p2Test{

    public static void main(String[] args) {
        HomeWork18p2 h1 = new HomeWork18p2();

        String[][]array1 = {{"apple","orange"},{"Hello","Bye","Ok"},{"Car"}};
        h1.showArray(array1);
    }
}