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

public class Matkalaukku {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat = new ArrayList<>();
    private int summa;
    
    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara) {       
        if (this.yhteispaino() + tavara.getPaino() <= maksimipaino) {
            this.tavarat.add(tavara);
        }
    }
    
    public Tavara raskainTavara() {
        if (tavarat.isEmpty()) {
            return null;
        }
        int muistio = 0;
        int raskain = 0;
        int laskuri = tavarat.size() - 1;
        while (laskuri > 0) {
            if (tavarat.get(laskuri).getPaino() > raskain) {
                raskain = tavarat.get(laskuri).getPaino();
                muistio = laskuri;
                laskuri--;
            }            
        }        
        return tavarat.get(muistio);        
    }
    
    
    
    public int yhteispaino() {
        this.summa = 0;
        for (Tavara paino: this.tavarat) {
            this.summa = this.summa + paino.getPaino();
        }
        return this.summa;
    }
    
    public void tulostaTavarat() {
        for (Tavara tulosta: this.tavarat) {
            System.out.println(tulosta);
        }        
    }

    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        } else if (this.tavarat.size() == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)"; 
        }
        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
}