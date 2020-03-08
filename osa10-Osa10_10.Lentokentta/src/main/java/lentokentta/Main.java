package lentokentta;
import lentokentta.ui.Tekstikayttoliittyma;
import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone;
import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;

public class Main {
    
    private Tekstikayttoliittyma tekstikayttoliittyma;

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                
        Lentohallinta lentohallinta = new Lentohallinta();
        Tekstikayttoliittyma tekstikayttoliittyma = new Tekstikayttoliittyma(lentohallinta, lukija);
        
        tekstikayttoliittyma.kaynnista();
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
    }
}
