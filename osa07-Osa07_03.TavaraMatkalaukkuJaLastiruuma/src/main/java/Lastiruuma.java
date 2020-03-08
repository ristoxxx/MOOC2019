/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */

import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private int summat;
    private ArrayList<Matkalaukku> laukut = new ArrayList<>();
         
    
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (this.laukkujenYhteispaino() + laukku.yhteispaino() <= this.maksimipaino) {
            this.laukut.add(laukku);
        }
        
    }

    public int laukkujenYhteispaino() { 
        this.summat = 0;
        for (Matkalaukku paino: this.laukut) {
            this.summat = this.summat + paino.yhteispaino();
        }
        return this.summat;
    }
    
    public void tulostaTavarat() {
        System.out.println("Ruuman matkalaukuissa on seuraavat tavarat:");
        for (Matkalaukku tavarat: this.laukut) {
            tavarat.tulostaTavarat();
        }
    }
            
    public String toString() {
        return laukut.size() + " matkalaukkua (" + laukkujenYhteispaino() + " kg)";        
    }    
}
