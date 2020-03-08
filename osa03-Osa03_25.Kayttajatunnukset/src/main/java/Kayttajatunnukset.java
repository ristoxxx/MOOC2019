
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna käyttäjätunnuts: ");
        String tunnus = String.valueOf(lukija.nextLine());
        System.out.print("Anna salasana: ");
        String salasana = String.valueOf(lukija.nextLine());
        int oikein = 0;
        
        if (tunnus.equals("elina") && salasana.equals("kissa")) {
            oikein = 1;
        }
        if (tunnus.equals("aleksi") && salasana.equals("tappara")) {
            oikein = 1;
        } 
        
        kirjauduit(oikein);    
            
        
        
        
    }
    public static void kirjauduit(int oikein) {
        if (oikein == 1) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    
    }
}
