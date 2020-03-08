
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku");
        
        int ekaluku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku");
        
        int tokaluku = Integer.valueOf(lukija.nextLine());
        
        if (ekaluku > tokaluku) {
            System.out.println("Suurempi luku: " + ekaluku);
        } else if (tokaluku > ekaluku) {
            System.out.println("Suurempi luku: " + tokaluku);
        } else if (ekaluku == tokaluku) {
            System.out.println("Luvut ovat yhtä suuret!");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
