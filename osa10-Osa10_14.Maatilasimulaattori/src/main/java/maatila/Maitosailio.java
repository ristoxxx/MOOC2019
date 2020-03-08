/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import static java.lang.Math.ceil;

/**
 *
 * @author Evermore
 */
public class Maitosailio {
    
    private double tilavuus;
    private double saldo;
    
    public Maitosailio() {
        this.tilavuus = 2000.0;
    }
    
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }
    
    public double getTilavuus() {
        return this.tilavuus;        
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double paljonkoTilaaJaljella() {
        return this.tilavuus - this.saldo;
    }
    
    public void lisaaSailioon(double maara) {
        if (this.saldo + maara > this.tilavuus) {
            this.saldo = this.tilavuus;
        } else {
            this.saldo = this.saldo + maara;
        }
    }
    
    public double otaSailiosta(double maara) {
        if (this.saldo < maara) {
            double apu = this.saldo;
            this.saldo = 0;
            return apu;
        } else {
            this.saldo = this.saldo - maara; 
            return maara;
        }
    }
    
    public String toString() {
        return ceil(this.saldo) + "/" + ceil(this.tilavuus);
    }
}
    