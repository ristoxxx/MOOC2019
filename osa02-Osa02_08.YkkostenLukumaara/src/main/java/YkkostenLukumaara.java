
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        //luodaan muuttuja ykkoset ja asetetaan arvoksi 0
        int ykkoset = 0;
        
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
            }           
        }    
        //tulostetaan ykkösten summa
        System.out.println(ykkoset);
    }
}
