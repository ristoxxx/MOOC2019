
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        
        String ekasana = lukija.nextLine();
        
        System.out.println("Syötä toinen merkkijono:");
        
        String tokasana = lukija.nextLine();

        if (ekasana.equals(tokasana)) {
        System.out.println("Samat sanat");
        } else {
        System.out.println("Ei sitten");
        }
        
        // Toteuta ohjelmasi tähän. 
    }
}
