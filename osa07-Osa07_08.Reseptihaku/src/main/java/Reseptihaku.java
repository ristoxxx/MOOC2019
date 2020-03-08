
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
        
    

public class Reseptihaku {
    

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Resepti> reseptit = new ArrayList<>();
        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
        reseptit.get(0)

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String nimi = tiedostonLukija.nextLine();
                int keittoaika = Integer.valueOf(tiedostonLukija.nextLine());
                Resepti resepti = new Resepti(nimi, keittoaika);
                reseptit.add(resepti);
            
                while (tiedostonLukija.hasNextLine()) {
                
                    String uusiAines = tiedostonLukija.nextLine();                
                    if (uusiAines.isEmpty()) {
                        break;
                    }
                    resepti.lisaaAines(uusiAines);
                }
            
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("listaa")) {
                System.out.println("Reseptit:");
                for (Resepti resepti : reseptit) {
                    System.out.println(resepti);
                }
            }

            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                for (Resepti resepti : reseptit) {
                    if (resepti.nimiSisaltaa(haettava)) {
                        System.out.println(resepti);
                    }
                }
            }

            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int korkeintaan = Integer.valueOf(lukija.nextLine());

                for (Resepti resepti : reseptit) {
                    if (resepti.keittoaikaKorkeintaan(korkeintaan)) {
                        System.out.println(resepti);
                    }
                }
            }

            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String aine = lukija.nextLine();

                for (Resepti resepti : reseptit) {
                    if (resepti.sisaltaaAineksen(aine)) {
                        System.out.println(resepti);
                    }
                }
            }
        }
        
    }

    

}
