
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kolmellaJaollisetValilta(2, 10);
    }
    public static void kolmellaJaollisetValilta(int eka, int toka){
        int laskuri = eka;
        while (laskuri<=toka){
            if (laskuri%3==0){
                System.out.println(laskuri);
                laskuri++;
            } else {
                laskuri++;
            }
                
        }
    }

}
