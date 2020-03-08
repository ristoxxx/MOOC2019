

import java.util.ArrayList;

public class Resepti {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> ainekset = new ArrayList<>();

    public Resepti(String nimi, int keittoaika) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.ainekset = ainekset;
    }
 
    public void lisaaAines(String aines) {
        this.ainekset.add(aines);
    }
    
    public boolean keittoaikaKorkeintaan(int ylaraja) {
        return this.keittoaika <= ylaraja;
    }

    public boolean nimiSisaltaa(String haettu) {
        return this.nimi.contains(haettu);
    }

    public boolean sisaltaaAineksen(String aine) {
        return this.ainekset.contains(aine);
    }

    @Override
    public String toString() {
        return this.nimi + ", keittoaika: " + keittoaika;
    }
}
