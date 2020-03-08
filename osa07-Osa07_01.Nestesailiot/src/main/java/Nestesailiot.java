
import java.util.Scanner;

public class Nestesailiot {
    

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;
        

        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {

                break;
            } else if (luettu.contains("lisaa")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                if (pala < 0) {
                    pala = 0;
                }
                ensimmainen = ensimmainen + pala;
                if (ensimmainen > 100) {
                    ensimmainen = 100;
                }

            } else if (luettu.contains("siirra")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                if (pala < 0) {
                    pala = 0;               
                } else if (pala > ensimmainen) {
                    pala = ensimmainen;
                }
                ensimmainen = ensimmainen - pala;
                toinen = toinen + pala;
                if (toinen > 100) {
                    toinen = 100;
                }

            } else if (luettu.contains("poista")) {
                String[] palat = luettu.split("\\s+");
                int pala = Integer.valueOf(palat[1]);
                if (pala < 0) {
                    pala = 0;               
                } else if (pala > toinen) {
                    pala = toinen;
                }
                toinen = toinen - pala;

                
            }

            
        }    
        
    }
    
    

}
