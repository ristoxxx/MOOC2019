
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(2);
    }
public static void tulostaLukuunAsti(int luku) {
        int laskuri = 1;
        while (laskuri<=luku){
            System.out.println(laskuri);
            laskuri++;
        }
}
}
