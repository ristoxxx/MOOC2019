
import java.util.HashMap;

public class Ohjelma {


    public static void main(String[] args) {
        HashMap<String, String> taulu = new HashMap<>();
        taulu.put("esim.", "esimerkiksi");
        taulu.put("jne.", "ja niin edelleen");
        taulu.put("yms.", "ynnä muuta sellaista");

        tulostaAvaimet(taulu);
        System.out.println("---");
        tulostaAvaimetJoissa(taulu, "ym");
        System.out.println("---");
        
        // Testaa ohjelmasi toimintaa täällä!
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for(String avain : hajautustaulu.keySet()) {
            System.out.println(avain); 
        }
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for(String avain : hajautustaulu.keySet()) {
        if(avain.contains(merkkijono)) {
            System.out.println(avain);
        }
        }
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for(String avain : hajautustaulu.keySet()) {
        if(hajautustaulu.get(avain).contains(merkkijono)) {
            
            System.out.println(hajautustaulu.get(avain));
        }
        }
        
    }

}
