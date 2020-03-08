
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> syntymavuodet = new ArrayList<>();
               
        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

        // luetaan tiedostoja kunnes kaikki rivit on luettu
        while (tiedostonLukija.hasNextLine()) {
            // luetaan yksi rivi
            String rivi = tiedostonLukija.nextLine();
            // tulostetaan luettu rivi
            lista.add(rivi) ;       
            
            String[] osat = rivi.split(",");
            nimet.add(osat[0]);
            syntymavuodet.add(Integer.valueOf(osat[1]));
        }   
        int apu = 0 ;
        int vanhin = 0;       
        int indeksi = 0;
        while (indeksi < lista.size()) { 
            if (syntymavuodet.get(indeksi) > vanhin) {
                  apu = indeksi;
                  vanhin = syntymavuodet.get(indeksi);
            }
            indeksi++;
        }        
        System.out.println("Vanhin oli: " + nimet.get(apu));
        } catch (Exception e) {
        System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        
        System.out.println(e.getMessage());
        }
    }
}
