/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import static java.lang.Math.ceil;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Evermore
 */

public class Lehma implements Eleleva, Lypsava {
    
    private String nimi;
    private double tilavuus;
    private double maara;
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    
    public Lehma() {
        this.nimi = NIMIA[new Random().nextInt(30)];
        this.tilavuus = 15 + new Random().nextInt(26);
        this.maara = 0;
    }
    
    public Lehma(String nimi) {
        this.nimi = nimi;
        this.tilavuus = 15 + new Random().nextInt(26);
        this.maara = 0;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public double getTilavuus() {
        return this.tilavuus;
    }
    
    public double getMaara() {
        return this.maara;
    }
    
    public String toString() {
        return this.nimi + " " + ceil(this.maara) + "/" + ceil(this.tilavuus);
    }    

    @Override
    public void eleleTunti() {
        if (this.maara + 0.7 + new Random().nextDouble() > this.tilavuus) {
            this.maara = this.tilavuus;
        } else {
            this.maara = this.maara + 0.7 + new Random().nextDouble();
        }    
    }

    @Override
    public double lypsa() {
        double apu = this.maara;
        this.maara = 0;
        return apu;
    }
}
