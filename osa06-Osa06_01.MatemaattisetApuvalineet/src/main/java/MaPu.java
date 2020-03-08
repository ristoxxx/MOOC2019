
import java.util.ArrayList;

public class MaPu {
    
    public static double keskiarvo(ArrayList<Integer> luvut) {
        int summa = 0;
        for(int luku: luvut) {
            summa = summa + luku;
        }
        return 1.0 * summa / luvut.size();
    }

    // toteuta apumetodit tänne
}
