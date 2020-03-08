
import java.util.Scanner;


public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
        // alusta tässä muuttuja lukujenMaara
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara = lukujenMaara + 1;
        this.summa = this.summa + luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return summa;
    }

    public double keskiarvo() {
        if (lukujenMaara <= 0) {
            return 0;
            
        } else {
        return 1.0 * summa / lukujenMaara;
        }
    }
}
