
import java.util.ArrayList;
import java.util.Collections;

public class Taikanelio {

    private int[][] nelio;

    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }
        this.nelio = new int[koko][koko];
        
//        int[][] matriisi = {
//    {3, 2, 7},
//    {2, 4, 1},
//    {3, 2, 1}
//};
//        this.nelio = matriisi;
    }

    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
        ArrayList<Integer> summa = new ArrayList<>();
        int rivinSumma = 0;
        int koko = this.nelio.length;
        for (int i = 0 ; i < koko ; i++) {
            for (int y = 0 ; y < koko ; y++) {
                rivinSumma = rivinSumma + this.nelio[i][y];                 
            }
        summa.add(rivinSumma);
        rivinSumma = 0;
        }
        System.out.println(summa);
        return summa;
    }

    public ArrayList<Integer> sarakkeidenSummat() {
        ArrayList<Integer> summa = new ArrayList<>();
        int rivinSumma = 0;
        int koko = this.nelio.length;
        for (int i = 0 ; i < koko ; i++) {
            for (int y = 0 ; y < koko ; y++) {
                rivinSumma = rivinSumma + this.nelio[y][i]; 
            }
        summa.add(rivinSumma);
        rivinSumma = 0;
        }
        System.out.println(summa);
        return summa;
    }

    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> summa = new ArrayList<>();
        int rivinSumma = 0;
        int koko = this.nelio.length;
        for (int i = 0 ; i < koko ; i++) {
                rivinSumma = rivinSumma + this.nelio[i][i]; 
            }
        summa.add(rivinSumma);

        rivinSumma = 0;
        
        int y = koko - 1;
        for (int i = 0 ; i <= koko - 1 ; i++) {
            
                rivinSumma = rivinSumma + this.nelio[i][y]; 
                System.out.println(y);
            y--;        
        }
        summa.add(rivinSumma);
        
        return summa;
    }

    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }

    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }

        return numerot;
    }

    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();

        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());

        if (summat.size() < 3) {
            return false;
        }

        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }

        return this.nelio[y][x];
    }

    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }

        this.nelio[y][x] = arvo;
    }

    public int getLeveys() {
        return this.nelio.length;
    }

    public int getKorkeus() {
        return this.nelio.length;
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }

            palautus.append("\n");
        }

        return palautus.toString();
    }
}
