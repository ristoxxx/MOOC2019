
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kasi implements Comparable<Kasi> {
    
    private ArrayList<Kortti> kasi;
    
    public Kasi() {
        this.kasi = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        this.kasi.add(kortti);
    }
    
    public void tulosta() {
        Iterator<Kortti> iteraattori = kasi.iterator();
        
        while (iteraattori.hasNext()) {
                System.out.println(iteraattori.next());
        }   
    }
    
    public int compareTo(Kasi kasi) {
        int eka = 0;
        int toka = 0;
        
        for (int i = 0; i < this.kasi.size(); i++) {
            eka = eka + this.kasi.get(i).getArvo();
        }
        for (int i = 0; i < kasi.kasi.size(); i++) {
            toka = toka + kasi.kasi.get(i).getArvo();
        }
        

        if (eka > toka) {
            return 1;
        } else if (toka > eka) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public void jarjestaMaittain() {
        Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
        
    }
    
    public void jarjesta() {
        Kortti apu;
        Kortti aputoka;
        Kortti apukolmas;
        for (int i = 0; i < kasi.size() - 1; i++) {
            apu = kasi.get(i);
            aputoka = kasi.get(i + 1);
            if (apu.compareTo(aputoka) == 1) {
                apukolmas = apu;
                kasi.set(i, aputoka);
                kasi.set(i + 1, apukolmas);
            }   
        }
    }
}