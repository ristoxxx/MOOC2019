/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
        
public class Kellari {
    private HashMap<String, ArrayList<String>> komerot = new HashMap<>();
    
    public Kellari() {
        
    }
    
    public void lisaa(String komero, String tavara) {
        this.komerot.putIfAbsent(komero, new ArrayList<>());
        this.komerot.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        if (this.komerot.containsKey(komero)) {
            return this.komerot.get(komero);
        } else {
            return new ArrayList<>();        
        }        
    }
    
    public void poista(String komero, String tavara) {
        if (this.komerot.containsKey(komero) && this.komerot.get(komero).contains(tavara)) {
            this.komerot.get(komero).remove(tavara);
        }
    }
    
    public ArrayList<String> komerot() {   
        ArrayList<String> taydet = new ArrayList<>();
        for(String komero : komerot.keySet()) {
            if (!komerot.get(komero).isEmpty()) {
                taydet.add(komero);
//                System.out.println(rekkari);
            }
        }
        return taydet;
        
        
        
        
    }
}
