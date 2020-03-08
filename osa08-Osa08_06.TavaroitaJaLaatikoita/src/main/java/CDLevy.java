/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class CDLevy implements Talletettava {
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    private double paino;
    
    public CDLevy(String artisti, String nimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.julkaisuvuosi = julkaisuvuosi;
        this.nimi = nimi;
        this.paino = 0.1;
    }
    
    public String toString() {
        return artisti + ": " + nimi + " (" + julkaisuvuosi + ")";
    } 
    
    @Override
    public double paino() {
        return this.paino;
        
    }
}
