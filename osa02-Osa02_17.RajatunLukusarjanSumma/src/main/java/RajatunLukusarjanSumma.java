
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Ensimmäinen: ");
        int alku = Integer.valueOf(lukija.nextLine());
        
        int summa = 0;
        
        System.out.println("Viimeinen: ");
        int luku = Integer.valueOf(lukija.nextLine());        
        
        while (alku<=luku) {                        
            summa = summa + alku;
            alku++;
        }
        System.out.println(summa);
    }
}
