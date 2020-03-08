/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

/**
 *
 * @author Evermore
 */
public class Sovelluslogiikka {
    private Kayttoliittyma k;
    
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.k = kayttoliittyma;
    }
    
    public void suorita(int montaKertaa) {
        
        for (int i = 0; i < montaKertaa; i++) {
            System.out.println("Sovelluslogiikka toimii");
            k.paivita();
        }
        
    }
    
}
