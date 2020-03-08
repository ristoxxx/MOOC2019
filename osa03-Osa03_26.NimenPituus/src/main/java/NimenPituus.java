
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = String.valueOf(lukija.nextLine());
        System.out.print("Kirjainmäärä: " + laskeKirjaimet(nimi));
        // kutsu täältä metodiasi
    }
    public static int laskeKirjaimet(String merkkijono) {
        int pituus = merkkijono.length();
        return pituus;
    }
    // tee tänne metodi 
    // public static int laskeKirjaimet(String merkkijono)
    
}
