
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "...."));

        tulostaArvot(taulu);
        System.out.println("---");
        tulostaArvoJosNimessa(taulu, "ennakko");
        // Testaa ohjelmasi toimintaa täällä!
    }
    
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for(String avain : hajautustaulu.keySet()) {
            System.out.println(hajautustaulu.get(avain));
        }
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {

       for(String avain : hajautustaulu.keySet()) {
           Kirja kirja = hajautustaulu.get(avain);
           String nimi = kirja.getNimi();
           if (nimi.contains(merkkijono)) {         
               System.out.println(hajautustaulu.get(avain));
        }
        }
        
    }
}
