package testisanakirja;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Evermore
 */
public class Sanakirja {
    
    private HashMap<String, String> sanakirja;
    
    public Sanakirja() {
        this.sanakirja = new HashMap<>();
}
            
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.put(sana, kaannos);
        
    }
    
    public int sanojenLukumaara() {
        return sanakirja.size();
    }
    
    public String kaanna(String sana) {
        return this.sanakirja.get(sana);
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> listana = new ArrayList<>();
        for (String lista: sanakirja.keySet()) {
            String kaannos = sanakirja.get(lista);
            listana.add(lista + "=" + kaannos);
        }
        return listana;
    }
}