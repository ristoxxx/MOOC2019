/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kirja implements Talletettava {
    
    private String kirjoittaja;
    private String nimi;
    private double paino;
    
    
    
    public Kirja(String kirjoittaja, String nimi, double paino) {
        this.paino = paino;
        this.kirjoittaja = kirjoittaja;
        this.nimi = nimi;
    }
    
    public String toString() {
        return kirjoittaja + ": " + nimi;
    }
    
    @Override
    public double paino() {
        return this.paino;
        
    }
    
}
