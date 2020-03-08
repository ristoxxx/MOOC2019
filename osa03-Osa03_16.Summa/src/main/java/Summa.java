
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);       
        System.out.println(summa(luvut));
        // kokeile toteuttamasi metodin toimintaa täällä
    }
    
    public static int summa(ArrayList<Integer> luvut){ 
        int tulos = 0;
        for (Integer luku: luvut ) {
        tulos = tulos + luku;
        }
        return tulos;
    }
    
}
