
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!
        while (true) {
            System.out.print("Anna salasana: ");
            String salasanaKysytty = String.valueOf(lukija.nextLine());
            if (salasanaKysytty.equals(salasana)) {                
                System.out.println("Oikein!");
                break;
            } else {
                System.out.println("Väärin!");
            }
        }
        System.out.println("Salaisuus on: znvavbfgv grugl!");
        // Toteuta ohjelmasi tähän.
    }
}
