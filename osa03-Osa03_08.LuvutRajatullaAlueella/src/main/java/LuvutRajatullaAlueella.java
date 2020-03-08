
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        
        System.out.print("Mistä? ");
        int laskuri = Integer.valueOf(lukija.nextLine());
        System.out.print("Mihin? ");
        int viimeinen = Integer.valueOf(lukija.nextLine());
        while (laskuri <= viimeinen ) {
            System.out.println(luvut.get(laskuri));
            laskuri++;  
        }

    }
}
