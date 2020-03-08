
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Lauma implements Siirrettava {
    private ArrayList<Siirrettava> lauma;
    
    public Lauma() {
        this.lauma = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }
    
    public void siirra(int dx, int dy) {
        for (Siirrettava olio : this.lauma) {
            olio.siirra(dx, dy);
        }
        
    }
    
    @Override
    public String toString() {
        String tulostus = "";
//        return this.lauma.;
        for (Siirrettava siirrettava : this.lauma) {
            tulostus = tulostus + siirrettava + "\n";            
        }
        return tulostus;
//        System.out.println(this.lauma);
//        return this.lauma.toString();
        
    }
          
}
