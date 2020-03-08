/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Evermore
 */
public class Maatila implements Eleleva {
    
    private Navetta navetta;
    private String omistaja;
    private List<Lehma> lehmat;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
        
    }
    
    public String getOmistaja() {
        return this.omistaja;
    }
    
    public void lisaaLehma(Lehma lehma) {
        lehmat.add(lehma);
    } 
    
    public void eleleTunti() {
        for (Lehma lehma : lehmat) {
            lehma.eleleTunti();
        }
    }
    
    public void hoidaLehmat() {
        this.navetta.hoida(lehmat);
        
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
//        lypsyrobotti.setMaitosailio(this.navetta.getMaitosailio());
    }
    
    @Override
    public String toString() {
        return "Maatilan omistaja: " + omistaja + "\n" +
               "Navetan maitosäiliö: " + navetta.getMaitosailio().toString() + "\n" +
               "Lehmät: \n" + lehmat;  
    }
}