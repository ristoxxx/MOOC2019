
import java.util.ArrayList;
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> syntymavuodet = new ArrayList<>();
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("loppu")) {
                break;
            }

            String[] osat = luettu.split(",");
            nimet.add(osat[0]);
            syntymavuodet.add(Integer.valueOf(osat[1]));
        }
        
        int apu = 0 ;
        int nuorin = 1000;       
        int indeksi = 0;
        while (indeksi < nimet.size()) { 
            if (syntymavuodet.get(indeksi) < nuorin) {
                  apu = indeksi;
                  nuorin = syntymavuodet.get(indeksi);
            }
            indeksi++;
        }        
        System.out.println("Nuorin oli : " + nimet.get(apu));
        
        
    }
}
