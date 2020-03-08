
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int laskuri = 0;
        
        while (true) {
            String sanat = lukija.nextLine();
            if (sanat.equals("loppu")) {
                break;
            }
            laskuri++;
        }
        System.out.print(laskuri);
    }
}
