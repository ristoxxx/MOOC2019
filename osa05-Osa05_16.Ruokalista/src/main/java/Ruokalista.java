
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }
    
    public void lisaaAteria(String ateria) {
        boolean loytyiko = ateriat.contains(ateria);
        if (loytyiko) {
            return;
        } else {
             ateriat.add(ateria);
        }
        
    }

    public void tulostaAteriat() {
        for (String lista: ateriat) {
            System.out.println(lista);
        }
    }

    public void tyhjennaRuokalista() {
        ateriat.clear();
    }

    // toteuta tänne tarvittavat metodit
}
