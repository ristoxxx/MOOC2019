package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

                if (nimi == null) {
                    throw new IllegalArgumentException("Nimen pitää olla 1-40 merkkiä pitkä");
                }
 
                if (nimi.length() == 0 | nimi.length() > 40 | ika < 0 | ika > 120) {
                    throw new IllegalArgumentException("Nimen pitää olla 1-40 merkkiä pitkä");
                } 
                    this.nimi = nimi;
                    this.ika = ika;   

    }
    public String getNimi() {
        return nimi;
    }
    public int getIka() {
        return ika;
    }
}