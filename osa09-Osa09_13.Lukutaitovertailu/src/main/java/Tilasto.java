/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Tilasto {
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double prosentti;
    
    
    public Tilasto(String sukupuoli, String maa, int vuosi, double prosentti) {
        this.maa = maa;
        this.prosentti = prosentti;
        this.sukupuoli = sukupuoli;
        this.vuosi = vuosi;
    }
    
    public double getProsentti() {
        return this.prosentti;
    }
    
    public String toString() {
        return this.maa + " (" + this.vuosi + ")," + this.sukupuoli + ", " + this.prosentti;
    }
}
