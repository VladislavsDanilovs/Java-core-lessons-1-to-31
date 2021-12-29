package Lesson27;

public class Test15  {

    void marafon(int tVozduha, int tempBega) throws PodvernutNoguException {
        if(tempBega > 12) {
            throw new PodvernutNoguException("Temp bega bolwoj: " + tempBega);
        }
        if(tVozduha > 45) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probezali marafon");
    }
    public static void main(String[] args) {
        Test15 t = new Test15();
        try{
            t.marafon(46, 8);
        } catch(PodvernutNoguException e) {
            System.out.println("sliwkom bistro bezhish!"+" "+e.getMessage());
        }
        catch(SveloMishcuException e) {
            System.out.println("Sliwkom zharko dlja bega");
    }
         finally{
            System.out.println("Poluchite sertifikam za marafon");
        }
      
    }
 
}

class PodvernutNoguException extends Exception{
    PodvernutNoguException(String message) {
        super(message);
    }
    PodvernutNoguException() {
    }

}

class SveloMishcuException extends RuntimeException{
    SveloMishcuException(String message) {
        super(message);
    }
    SveloMishcuException() {
    }

}
