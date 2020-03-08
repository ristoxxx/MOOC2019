/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evermore
 */
import java.util.Scanner;

public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        System.out.println("Komennot:");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        System.out.println("lisaa - lisää sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        while (true) {
            System.out.println("");
            System.out.print("Komento:");
            String luettu = lukija.nextLine();
                if (luettu.equals("lopeta")) {
                    break;
                } else if (luettu.equals("lisaa")) {
                    System.out.print("Suomeksi:");
                    String suomeksi = lukija.nextLine();
                    System.out.print("Käännös:");
                    String kaannos = lukija.nextLine();
                    sanakirja.lisaa(suomeksi, kaannos);
                } else if (luettu.equals("kaanna")) {
                    System.out.print("Anna sana:");
                    String sana = lukija.nextLine();
                    System.out.println("Käännös:" + sanakirja.kaanna(sana));
                }
                else {
                    System.out.println("Tuntematon komento");
                }
        }
    }    
}
        