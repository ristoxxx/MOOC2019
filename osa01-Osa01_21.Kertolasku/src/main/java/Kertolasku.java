
import java.util.Scanner;

public class Kertolasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        
        int ekaluku = Integer.valueOf(lukija.nextLine());
        
        
        System.out.println("Syötä toinen luku!");
                
        int tokaluku = Integer.valueOf(lukija.nextLine());
        
        System.out.println(ekaluku +" * " +  tokaluku + " = " + (ekaluku * tokaluku));
        // toteuta ohjelma tänne

    }
}
