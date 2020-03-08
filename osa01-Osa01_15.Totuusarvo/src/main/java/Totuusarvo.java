
import java.util.Scanner;

public class Totuusarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä jotain!");
        
        String lukuMerkkijonona = lukija.nextLine();
        
        boolean luku = Boolean.valueOf(lukuMerkkijonona);
        
        System.out.println("Totta vaiko ei? " + luku);
        // toteuta ohjelma tänne

    }
}
