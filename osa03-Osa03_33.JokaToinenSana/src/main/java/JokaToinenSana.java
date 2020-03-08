
import java.util.ArrayList;
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
        while (true) {
            String merkkijono = lukija.nextLine();
            if (merkkijono.equals("")) {
                break;
            }

            String[] palat = merkkijono.split(" ");
            int indeksi = 0;
            while (indeksi < palat.length) {
                sanat.add(palat[indeksi]);
                indeksi++;
            }
        
            int laskuri = 1;
            while (laskuri < sanat.size()) {
                String sana = sanat.get(laskuri);
                System.out.println(sana);
                laskuri = laskuri + 2;
            }
            sanat = new ArrayList<>();
        }
        


    }
}
