/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author Evermore
 */
public class Vakiosensori implements Sensori{
    
    private int luku = 0;
    
    public Vakiosensori(int luku) {
        this.luku = luku;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
    }

    @Override
    public void poisPaalta() {
    }

    @Override
    public int mittaa() {
        return this.luku;
    }
    
    
}
