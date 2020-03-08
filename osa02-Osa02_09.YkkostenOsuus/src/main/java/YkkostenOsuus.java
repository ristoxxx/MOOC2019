
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //luodaan muuttujia ja asetetaan niiden arvoksi 0
        int ykkoset = 0;
        int laskuri = 0;
        double osuus = 0;
        
        //luodaan silmukka
        while (true) {
            //luetaan kokonaisluku muuttujaan luku
            int luku = Integer.valueOf(lukija.nextLine());
            //verrataan muuttujaa luku numeroon 0
            //jos yhtäläinen poistutaan silmukasta            
            if (luku == 0) {
                break;
            //verrataan muuttujaa luku numeroon 1
            //jos yhtäläinen lisätään muuttujan ykkoset arvoon 1
            } else if (luku == 1) {
                ykkoset = ykkoset + 1;
                //lisätään muutujan laskuri arvoon 1
                //laskuri laskeen numeroiden määrän
                laskuri = laskuri + 1;
            } else {
                laskuri = laskuri + 1;
            }          
        }    
        //tarkistetaan onko jakaja 0
        if (laskuri == 0) {
            System.out.println("osuutta ei voida laskea");
        //lasketaan ja tulostetaan ykkösten osuus
        } else {
            System.out.println((1.0*ykkoset/laskuri));
        }
    }
}
