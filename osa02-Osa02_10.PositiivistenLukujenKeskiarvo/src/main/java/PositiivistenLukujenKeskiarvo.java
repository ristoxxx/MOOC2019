
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
     
        int luku = 0;
        int summa = 0;
        int laskuri = 0;
        
        while (true) {
            luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            } else if (luku >0) { 
                summa = summa + luku;
                laskuri = laskuri + 1;                        
            } else {
                continue;            
            }         
            
        }
        if (laskuri == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            System.out.println((1.0*summa/laskuri));
        }
        
    }
}
