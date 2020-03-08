
public class Kasvatuslaitos {
    private int punnitukset;

    public int punnitse(Henkilo henkilo) {
        punnitukset = punnitukset + 1;
        return henkilo.getPaino();
        // palautetaan parametrina annetun henkilön paino
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }

    public int punnitukset() {
        return punnitukset;
    }
}
