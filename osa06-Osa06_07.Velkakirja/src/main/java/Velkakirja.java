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

public class Velkakirja {
    private HashMap<String, Double> taulukko = new HashMap<>();
      
    
    public Velkakirja() {
        
       
    }
    
    public void asetaLaina(String kenelle, double maara) {
        taulukko.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        return taulukko.getOrDefault(kuka, 0.0);
    }
    
}
