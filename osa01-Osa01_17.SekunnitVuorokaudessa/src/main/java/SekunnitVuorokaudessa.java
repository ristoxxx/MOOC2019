
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        
        String lukuMerkkijonona = lukija.nextLine();
        
        int vuorokaudet = Integer.valueOf(lukuMerkkijonona);
        int sekunnitvuorokaudessa = 86400;
        System.out.println(vuorokaudet * sekunnitvuorokaudessa);

    }
}
