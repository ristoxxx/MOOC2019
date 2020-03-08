
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int alku = 1;        
        int summa = 1;        
        System.out.println("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());        
        
        while (alku<=luku) {                        
            summa = summa * alku;
            alku++;
        }
        System.out.println("Kertoma on " + summa);
    }
}
