
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            kirjat.add(new Kirja(nimi, ika));
        }

        System.out.println("Yhteensä " + kirjat.size() +  " kirjaa." + "\n");
        System.out.println("Kirjat:");
  
        Comparator<Kirja> vertailija = Comparator
              .comparing(Kirja::getIka)
              .thenComparing(Kirja::getNimi);

        Collections.sort(kirjat, vertailija);

        for (Kirja k: kirjat) {
            System.out.println(k);
        }

        
        
        

    }

}
