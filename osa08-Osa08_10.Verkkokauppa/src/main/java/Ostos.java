/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Ostos {
    
    private String tuote;
    private int kpl;
    private int hinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.hinta = yksikkohinta;
    }
    
    public int hinta() {
        return this.hinta * kpl;
    } 
    
    public void kasvataMaaraa() {
        this.kpl = this.kpl + 1;
    }
    
    public String toString() {
        return tuote + ": " + kpl;
        
    }
}
