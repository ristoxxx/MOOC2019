
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] arvot = {8, -2, 3, 1, 1};
        System.out.println(summa(arvot, 0, 5, 0, 999));
        // voit testata luokkaasi täällä

    }
    
    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        int summa = 0;
        if (mista < 0) {
            mista = 0;
        }
        
        if (mihin > taulukko.length) {
            mihin = taulukko.length;
        }
        
        for (int i = mista ; i < mihin ; i++) {
            if (taulukko[i] >= pienin && taulukko[i] <= suurin) { 
                summa = summa + taulukko[i];
            }
        }
        return summa;
    }
}