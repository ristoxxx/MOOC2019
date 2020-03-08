

public class Opiskelija implements Comparable<Opiskelija>{

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }
    
    @Override
    public int compareTo(Opiskelija toinen) {
        return this.getNimi().compareTo(toinen.getNimi());
    }
    
    
    @Override
    public String toString() {
        return nimi;
    }

}
