/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
public class Kirjat {
    
    private String nimi;
    private int sivuja;
    private int kirjoitusvuosi;

    public Kirjat(String nimi, int sivuja, int kirjoitusvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.kirjoitusvuosi = kirjoitusvuosi;
    }


    public String getNimi() {
        return nimi;
    }

    public int getSivuja() {
        return sivuja;
    }
    
    public int getVuosi() {
        return kirjoitusvuosi;        
    }
    
    @Override
    public String toString() {
        return  this.nimi +", " +  this.sivuja + " sivua, " + this.kirjoitusvuosi + "\n";
    }
}
    

