
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä merkkijono!");
        String merkkijono = lukija.nextLine();
        
        System.out.println("Syötä kokonaisluku!");
        String kokonaislukuMerkkijonona = lukija.nextLine();
        int kokonaisluku = Integer.valueOf(kokonaislukuMerkkijonona);
        
        System.out.println("Syötä liukuluku!");
        String liukulukuMerkkijonona = lukija.nextLine();
        double liukuluku = Double.valueOf(liukulukuMerkkijonona);
        
        System.out.println("Syötä totuusarvo!");
        String totuusarvoMerkkijonona = lukija.nextLine();
        boolean totuusarvo = Boolean.valueOf(totuusarvoMerkkijonona);
        
        System.out.println("Syötit merkkijonon " + merkkijono);
        System.out.println("Syötit kokonaisluvun " + kokonaisluku);
        System.out.println("Syötit liukuluvun " + liukuluku);
        System.out.println("Syötit totuusarvon " + totuusarvo);                

    }
}
