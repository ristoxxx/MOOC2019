
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int keskiarvo = 0 ;
        int lukumaara = 0 ;
        int summa = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {                
                break;
            } else {
                summa = (summa + (luku));
                lukumaara = (lukumaara + 1);
            }
        }
        keskiarvo = (summa / lukumaara);
        System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}