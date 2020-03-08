
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //määritellään kaksi muuttujaa ja luetaan niihin arvot
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());
        
        //suoritetaan vertailu ja tulostetaan vastaus
        if (eka>toka) {
            System.out.println("Luku " + eka + " on suurempi kuin luku " + toka);
        } else if (eka<toka) {
            System.out.println("Luku " + eka + " on pienempi kuin luku " + toka);
        } else {
            System.out.println("Luku " + eka + " on yhtä suuri kuin luku " + toka);
        }
    }
}
