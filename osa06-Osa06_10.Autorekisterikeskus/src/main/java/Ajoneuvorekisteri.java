/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
import java.util.HashMap;
import java.util.ArrayList;


public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat = new HashMap<>();
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        } else {
            return false;
        }
    }
    
    public String hae(Rekisterinumero rekkari) {
        return omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (!omistajat.containsKey(rekkari)) {
            return false;
        } else {
            omistajat.remove(rekkari);
            return true;
        }
    }
    
    public void tulostaRekisterinumerot() {
        for(Rekisterinumero rekkari : omistajat.keySet()) {
            System.out.println(rekkari);
        }
       
                     
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> tulostus = new ArrayList<>();
        for(String rekkari : omistajat.values()) {
            if (!tulostus.contains(rekkari)) {
                tulostus.add(rekkari);
                System.out.println(rekkari);
            }
        }
        
    }
    
}
