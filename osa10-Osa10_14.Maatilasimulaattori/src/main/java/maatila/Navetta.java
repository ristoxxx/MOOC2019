/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import static java.lang.Math.ceil;
import java.util.List;

/**
 *
 * @author Evermore
 */
public class Navetta {
    
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(maitosailio);
    }
       
    public void hoida(Lehma lehma) {
        if (this.lypsyrobotti == null) {
            throw new IllegalStateException("E");
        } else {
            this.lypsyrobotti.lypsa(lehma);
        }
    }
    
    public void hoida(List<Lehma> lehmat) {
        if (this.lypsyrobotti == null) {
            throw new IllegalStateException("E");
        } else {
            for (Lehma lehma : lehmat) {
                this.lypsyrobotti.lypsa(lehma);
            }           
        }
    }
    
    public String toString() {
        return "navetta: " + ceil(this.maitosailio.getSaldo()) + "/"  + ceil(this.maitosailio.getTilavuus()) ;
    }
    
}
