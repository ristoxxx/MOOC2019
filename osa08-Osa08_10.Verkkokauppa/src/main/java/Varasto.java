
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Varasto {
    private Map<String, Integer> saldot;
    private Map<String, Integer> varasto;
//    private String tuote;
//    private int hinta;
//    private int saldo;
    
    public Varasto() {
        this.varasto = new HashMap<>();
        this.saldot = new HashMap<>();

    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo)  {
        varasto.putIfAbsent(tuote, hinta);
        saldot.putIfAbsent(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if (varasto.containsKey(tuote)) {
            return varasto.getOrDefault(tuote, 0);
        } else {
            return -99;
        }
        
    }
    
    public int saldo(String tuote) {
        return saldot.getOrDefault(tuote, 0);
    }
    
    public boolean ota(String tuote) {
        if (!saldot.containsKey(tuote)){
            return false;
        } else if (saldot.get(tuote) - 1 > 0) {
            saldot.replace(tuote, saldot.get(tuote) - 1);
            return true;
        } else {
            saldot.replace(tuote, 0);
            return false;
        }
    }
    
    public Set<String> tuotteet() {
        return varasto.keySet();
        
    }
}
