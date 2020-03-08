/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kirja {
    
    private String nimi;
    private int ika;
    
    public Kirja(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }
    
    public int getIka() {
        return this.ika;
    }
    
    public String getNimi() {
        return this.nimi;
    }
            
    
    
    public String toString() {
        return nimi + "(" + ika + " vuotiaille ja vanhemmille)";
    }
    
}
