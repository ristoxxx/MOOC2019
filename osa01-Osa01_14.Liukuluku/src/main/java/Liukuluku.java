
import java.util.Scanner;

public class Liukuluku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luku!");
        
        String lukuMerkkijonona = lukija.nextLine();
        
        double luku = Double.valueOf(lukuMerkkijonona);
        
        System.out.println("Syötit luvun " + luku);
        // toteuta ohjelma tänne

    }
}
