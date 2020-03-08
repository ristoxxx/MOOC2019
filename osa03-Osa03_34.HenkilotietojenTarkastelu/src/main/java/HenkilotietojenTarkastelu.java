
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> syntymavuodet = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] osat = luettu.split(",");
            nimet.add(osat[0]);
            syntymavuodet.add(Integer.valueOf(osat[1]));
        }
        
        String pisin = nimet.get(0);
        for (String nimi : nimet) {
            if(nimi.length() > pisin.length()) {
                pisin = nimi;
            }
        }
        System.out.println("Pisin nimi: " + pisin);
        
        int syntymavuosienSumma = 0;
        for (int ika : syntymavuodet) {
            syntymavuosienSumma = syntymavuosienSumma + ika;
        }
        System.out.println("Syntymävuosien keskiarvo: " + 1.0 * syntymavuosienSumma / syntymavuodet.size());
        
    }
}