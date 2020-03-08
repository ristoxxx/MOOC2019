
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Ostoskori {
    
    private Map<String, Ostos> ostokset;
    
    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        if (this.ostokset.containsKey(tuote)) {
            ostokset.get(tuote).kasvataMaaraa();
        } else {
            this.ostokset.putIfAbsent(tuote, new Ostos(tuote, 1, hinta));    
        }    
    }
    
    public int hinta() {
        int summa = 0;
        for (Ostos ostos : ostokset.values()) {
            summa = summa + ostos.hinta();
        }       
        return summa;
    }
    
    public void tulosta() {
        for (Ostos ostos : ostokset.values()) {
            System.out.println(ostos.toString());
        }          
    }
}
