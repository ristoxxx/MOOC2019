
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        System.out.print("Ohjelman maksimi pituus? ");
        String maxPituus = lukija.nextLine();
        
        for (TelevisioOhjelma ohjelma: ohjelmat) {
            if (ohjelma.getPituus() <= Integer.valueOf(maxPituus)) {
                System.out.println(ohjelma);
            }
        }
    }
}
