/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Opiskelija extends Henkilo {
    private int pisteet;
    
    
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.pisteet = 0;
    }
    
    public void opiskele() {
        this.pisteet = this.pisteet + 1;
    }
    
    public int opintopisteita() {
        return this.pisteet;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + opintopisteita();
    }
}
