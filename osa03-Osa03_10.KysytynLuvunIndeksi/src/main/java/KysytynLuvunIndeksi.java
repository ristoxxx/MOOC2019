
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");
        System.out.print("Mitä etsitään? ");
        int etsittävä = Integer.valueOf(lukija.nextLine());
        
        int suurin = lista.get(0);
        int indeksi = 0;
        while (indeksi < lista.size()) {
            int luku = lista.get(indeksi);
            if (etsittävä == luku) {
               System.out.println("Luku " + etsittävä + " on indeksissä " + indeksi);
            }

            indeksi = indeksi + 1;
        }

        
        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}
