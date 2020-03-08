
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();
        
        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            } else if (luettu.contains("lisaa")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                ensimmainen.lisaa(pala);
            } else if (luettu.contains("siirra")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                if (pala > ensimmainen.sisalto()) {
                    pala = ensimmainen.sisalto();
                }
                ensimmainen.poista(pala);
                toinen.lisaa(pala);
            } else if (luettu.contains("poista")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                toinen.poista(pala);
            }

            

        }
    }

}