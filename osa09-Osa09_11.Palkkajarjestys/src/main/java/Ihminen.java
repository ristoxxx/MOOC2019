
public class Ihminen implements Comparable<Ihminen>{

    private int palkka;
    private String nimi;

    public Ihminen(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
    }

    public String getNimi() {
        return nimi;
    }

    public int getPalkka() {
        return palkka;
    }
    
    public int compareTo(Ihminen ihminen) {
        return ihminen.getPalkka() - this.palkka;
    }


    @Override
    public String toString() {
        return nimi + " " + palkka;
    }
}
