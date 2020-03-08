
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(5);
    }
public static void tulostaLuvustaYhteen(int luku) {
        int laskuri = luku;
        while (laskuri>=1){
            System.out.println(laskuri);
            laskuri--;
        }
    }

}
