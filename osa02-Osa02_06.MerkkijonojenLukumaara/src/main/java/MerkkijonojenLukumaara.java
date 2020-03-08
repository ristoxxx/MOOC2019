
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //luodaan muuttuja laskuri ja asetetaan arvoksi 0
        int laskuri = 0;
        
        //luodaan silmukka
        while (true) {
            //luetaan merkkijono muuttujaan teksti
            String teksti = (lukija.nextLine());
            //lisätään laskurin arvoon 1
            laskuri = laskuri + 1;
            //verrataan merkkijonoa mekkijonoon"loppu"
            //jos yhtäläinen niin poistutaan silmukasta
            if (teksti.equals("loppu")) {
                break;
            }            
        }    
        //tulostetaan silmukan suorituskertojen määrä
        //muuttujasta laskuri vähentäen "loppu" käsky
        System.out.println(laskuri-1);
    }
}
