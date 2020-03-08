
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int alku = 0;
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (alku<=luku) {
            System.out.println(alku);
            alku++;
        }
        
    }
}
