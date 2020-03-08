/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Evermore
 */
public class MuistavaSanakirja {
    
    private HashMap<String, String> sanakirja;
//    private HashMap<String, String> sanakirjab;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja =  new HashMap<>();
//        this.sanakirjab = new HashMap<>();
                
    }

    public MuistavaSanakirja(String tiedosto) {
        this.sanakirja = new HashMap<>();
        this.tiedosto = tiedosto;
    }
    
    public boolean lataa() {
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");   
                lisaa(osat[0], osat[1]); 
            }
            } catch (Exception e) {
               System.out.println("Virhe: " + e.getMessage());
            }
            return true;
    }
    
    public void lisaa(String sana, String kaannos) {
        if (!this.sanakirja.containsKey(sana)) {
            this.sanakirja.put(sana, kaannos);
        }
        if (!this.sanakirja.containsKey(kaannos)) {
            this.sanakirja.put(kaannos, sana);
        }
    }
    
    public String kaanna(String sana) {
//        if (this.sanakirja.get(sana) == null) {
//            return this.sanakirjab.get(sana);
//        } else {    
//        }
        return this.sanakirja.get(sana);
//        }
    }
    
    public void poista(String sana) {
        String apu = sanakirja.get(sana);
        sanakirja.remove(apu);
        sanakirja.remove(sana);
    }
    
    public boolean tallenna() {
//        int i = 0;
//        String teksti = "";
        try {
        PrintWriter kirjoittaja = new PrintWriter(tiedosto);
//        int ss = sanakirja.size();
        for (int i = 0; i < sanakirja.size() ;i++ )
            String rivi = sanakirja.get(1);
        sanakirja.get(1);
        kirjoittaja.println(sanakirja);
        kirjoittaja.close();
        return true;
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return false;
    }
    
}