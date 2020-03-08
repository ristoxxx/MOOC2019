
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kerätään lukuja listalle "luvut" kunnes käyttäjä syttää arvon -1
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        //tulostetaan listalle kertyneet luvut
        int viimeinen = luvut.size() - 1;
        int laskuri = 0;
        while (laskuri <= viimeinen ) {
            System.out.println(luvut.get(laskuri));
            laskuri++;            
                 
        }
    }
}
