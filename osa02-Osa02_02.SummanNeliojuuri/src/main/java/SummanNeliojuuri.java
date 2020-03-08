
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //määritellään kaksi muuttujaa ja luetaan niihin arvot
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());
        
        //määritellään tulokselle muuttuja ja suoritetaan lasku
        double tulos = Math.sqrt(eka+toka);
        
        //muutetaan vastaus kokonaisluvuksi tulostetaan se        
        System.out.println((int) tulos);
    }
}
