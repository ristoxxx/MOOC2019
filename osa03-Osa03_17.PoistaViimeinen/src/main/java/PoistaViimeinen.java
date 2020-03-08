
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");

        System.out.println(merkkijonot);

        poistaViimeinen(merkkijonot);
        poistaViimeinen(merkkijonot);

        System.out.println(merkkijonot);
    }
    public static void poistaViimeinen(ArrayList<String> merkkijonot){
            int viimeinen = merkkijonot.size() - 1;
            if (viimeinen > 0) {
            merkkijonot.remove(viimeinen);
            }
        // kokeile toteuttamasi metodin toimintaa täällä
    }

}
