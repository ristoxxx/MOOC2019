/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;        
    }

    public String toString() {
        return "Kortilla on rahaa " + saldo + " euroa";
    } 
    
    public void syoEdullisesti() {
        if (saldo >= 2.60) {
            this.saldo = this.saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (saldo >= 4.60) {
            this.saldo = this.saldo - 4.60;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        if (rahamaara <= 0) {
            return;
        } else if (this.saldo + rahamaara >= 150 ) {
            this.saldo = 150;
        } else {
            this.saldo = this.saldo + rahamaara;
        }
    }
}
