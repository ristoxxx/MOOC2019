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

public class Kirjasto {
    private ArrayList<Kirja> kirjasto = new ArrayList<>();
    
    public void lisaaKirja(Kirja uusiKirja) {
        kirjasto.add(uusiKirja);
    }
        
    public void tulostaKirjat() {
        for (Kirja tulosta: kirjasto) {
            System.out.println(tulosta);
        }
        
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimike) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja loytyi: kirjasto) {
            boolean ok = StringUtils.sisaltaa(loytyi.nimeke(), nimike);
            if (ok == true) {                             
                loydetyt.add(loytyi);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja loytyi: kirjasto) {
            if (loytyi.julkaisija().contains(julkaisija)) {
                loydetyt.add(loytyi);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja loytyi: kirjasto) {
            if (loytyi.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(loytyi);
            }
        }
        return loydetyt;
    }
    
}
