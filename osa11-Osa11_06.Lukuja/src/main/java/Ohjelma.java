
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random arpoja = new Random(); // luodaan apuväline arpoja
        System.out.println("Montako satunnaislukua tulostetaan?");
        int kertaa = Integer.valueOf(lukija.nextLine());
        
        for (int i = 0; i < kertaa; i++) {
            // Arvotaan ja tulostetaan satunnainen luku
            int luku = arpoja.nextInt(11);
            System.out.println(luku);
        }
    
            
    }

}
