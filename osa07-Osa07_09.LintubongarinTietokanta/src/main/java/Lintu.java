
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Lintu {
    private String nimi;
    private String latNimi;
    private int havaintokerrat;

    public Lintu(String nimi, String latNimi) {
        this.nimi = nimi;
        this.latNimi = latNimi;
        this.havaintokerrat = 0;
    }
 
    public int getHavaintokerrat() {
        return this.havaintokerrat;
    }

    public void lisaaHavainto() {
        this.havaintokerrat = this.havaintokerrat + 1;
    }
    
    public String tulostaLintu() {
        return this.nimi + " (" + latNimi + "): " + havaintokerrat + " havaintoa";
    }
    
    public boolean nimiSisaltaa(String haettu) {
        return this.nimi.equals(haettu);
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + latNimi + "): " + havaintokerrat + " havaintoa";
        
    }
}
