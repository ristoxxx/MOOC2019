
import java.util.Scanner;
import java.util.ArrayList;

public class SanatRiveittain {

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
        
        
        for (String sana: sanat) {
            System.out.println(sana);
            sanat = new ArrayList<>();
        }
        }
        


    }
}
