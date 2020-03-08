/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author Evermore
 */
public class Lampomittari implements Sensori {
    
    private boolean paalla;

    @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public void paalle() {
        this.paalla = true;
    }

    @Override
    public void poisPaalta() {
        this.paalla = false;
    }

    @Override
    public int mittaa() {
        if (paalla == false) {
            throw new IllegalStateException("Mittari ei päällä");
        }
        return new Random().nextInt(61) - 30;
    }    
}
